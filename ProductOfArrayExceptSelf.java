class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pref = new int[n];
        int[] suff = new int[n];
        int[] result = new int[n];

        pref[0]=1;
        suff[n-1]=1;

        for(int i=1;i<=n-1;i++){
            pref[i] = nums[i-1]*pref[i-1];
        }

        for(int i=n-2;i>=0;i--){
            suff[i] = nums[i+1]*suff[i+1];
        }

        for(int i=0;i<n;i++){
            result[i]= suff[i]*pref[i];
        }

        return result;

    }
}  
