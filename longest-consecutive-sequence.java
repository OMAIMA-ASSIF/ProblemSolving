//Principe : Only start counting if I am at the absolute bottom of my chain.
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums){
            set.add(num);
        }
        int longest = 0;
        for (int num:nums){
            if (!set.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;

                while(set.contains(currentNum + 1)){
                currentNum++;
                currentStreak++;
                }
            longest = Math.max(longest, currentStreak);
            }
        }

        return longest;
    }
}
