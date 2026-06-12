class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> visited = new HashMap<>();

        for(int i=0; i<nums.length ;i++ ){
            int complement = target - nums[i];
            if (visited.containsKey(complement)) {
                return new int[] { visited.get(complement), i };
            }
            visited.put(nums[i], i);
        }

        return new int[0];
    }
}

//Explanation : 
 // Create a HashMap to store values we have already visited.
        // Key: the number from the array
        // Value: the index of that number

// Check if the complement already exists in our HashMap
            // If yes, we have found the two numbers that sum to target
                // Return an array containing:
                // - the index of the complement (stored in the HashMap)
                // - the current index i
                // The problem guarantees exactly one solution, so we return immediately

          // If complement is not in the map, store the current number with its index.
                      // This way, future numbers can find it as their complement.
