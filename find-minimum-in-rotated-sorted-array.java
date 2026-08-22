class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int min = nums[0];
        while(left<=right){
            int mid = left + (right - left)/2;
            if (min<mid){
                min = mid;
            }
            if(nums[right]<nums[left]){
                left ++;
            }else{
                return nums[left];
            }
        }
        return min;
    }
}
