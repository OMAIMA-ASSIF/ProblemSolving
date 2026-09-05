public int longestSubarray(int[] nums, int k) {
    int left = 0;
    int sum = 0;
    int maxLength = 0;
    for (int right = 0; right < nums.length; right++) {
        sum += nums[right];
        while (sum > k) {
            sum -= nums[left];
            left++;
        }
        maxLength = Math.max(maxLength, right - left + 1);
    }
    return maxLength;
}
