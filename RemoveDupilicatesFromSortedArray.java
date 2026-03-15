class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 0;
        int n= nums.length;

        for (int i=1 ; i<n; i++){
            if(nums[i]!=nums[k]) {
                k++;
                nums[k]=nums[i];
            }
        }

        return k+1;
    }
}
