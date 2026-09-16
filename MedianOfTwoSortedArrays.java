//O(n+m) time et O(1) space 
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int i =0;
        int j =0;

        int m1=0, m2=0;

        for(int count =0 ; count<= (n+m)/2; count++){
            m2 =m1;
            if(i<n && j<m){
                if(nums1[i]>nums2[j]){
                    m1 = nums2[j];
                    j++;
                }else{
                    m1 = nums1[i];
                    i++;
                }
            }else if(i<n){
                m1 = nums1[i];
                i++;
            }else{
                m1 = nums2[j];
                j++;
            }
        }

        if((n+m)%2==0){
            return (m1 + m2)/2.0;
        }
        return (double)m1;
    }
}
