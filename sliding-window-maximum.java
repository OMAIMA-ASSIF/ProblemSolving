class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       int[] result = new int[nums.length -k +1];
       PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

       int left = 0;
       int resultIndex = 0;

       for(int right = 0; right<nums.length; right++){
        heap.add(nums[right]);
        while(right - left + 1 > k){
            heap.remove(nums[left]);
            left++;
        }

        if (right - left + 1 == k){
            
            result[resultIndex]= heap.peek();
            resultIndex++;
        }
       } 

       return result;
    }
}
