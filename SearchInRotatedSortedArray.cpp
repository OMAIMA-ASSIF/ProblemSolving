//0 ms 100% beats
class Solution {
public:
    int search(vector<int>& nums, int target) {
        int l=0,r=nums.size()-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if (nums[mid]==target) {
                return mid;
            }
            if (nums[l] <= nums [mid]){
                (nums[l]<=target && target <= nums[mid]) ? r=mid-1 : l=mid+1;
            }else{
                (nums[mid]<=target && target<=nums[r]) ? l=mid+1 : r=mid-1;
            }
            
        }
        return -1;
    }
};
