public int longestSubarraySumK(int[] nums, int k) {
  
  HashMap<Integer, Integer> firstIndex = new HashMap<>();
  int prefixSum = 0;
  int maxLength = 0;
  
  // Prefix sum 0 exists before index 0
  firstIndex.put(0, -1);
  
  for (int i = 0; i < nums.length; i++) {
        prefixSum += nums[i];
        int needed = prefixSum - k;
    
        if (firstIndex.containsKey(needed)) {
          int startIndex = firstIndex.get(needed);
          int length = i - startIndex;
          maxLength = Math.max(maxLength, length);
        }
  }
  return maxLength;
}
