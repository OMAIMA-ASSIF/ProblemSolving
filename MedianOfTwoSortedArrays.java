class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int k=0,i=0,j=0;
        double m;
        int size1 = nums1.length;
        int size2 = nums2.length;
        int size = nums.length;
        while(k< size && i<size1 && j<size2){
            if (nums1[i]<nums2[j]){
                nums[k]=nums1[i];
                i++;
            }
            else{
                nums[k]=nums2[j];
                j++;
            }
            k++;
        }

        if (i==size1 && k<size ){
            System.arraycopy(nums2,j , nums, k, size2 - j );
        }else if (j==size2 && k<size ){
            System.arraycopy(nums1,i , nums, k, size1 - i );
        }

        if(size %2 ==0){
            m =(double) (nums[(size)/2 -1]+nums[(size)/2])/2;
        }else{
            m = nums[(size-1)/2];
        }

        return m;

    }
}
