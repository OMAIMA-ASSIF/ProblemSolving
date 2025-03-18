class Solution(object):
    def twoSum(self, nums, target) :
        pair_idx = {}

        for i, num in enumerate(nums):
            complement = target - num
            if complement in pair_idx:
                return [i, pair_idx[complement]]
            pair_idx[num] = i
        return []
