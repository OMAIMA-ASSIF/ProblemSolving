class Solution {
    public int trap(int[] height) {
        int area = 0;
        int n = height.length;
        int[] pref = new int[n];
        int[] suff = new int[n];
        //for each index : min(suffMax, prefMax)-heights[i]

        pref[0] = height[0];
        suff[n-1] = height[n-1];

        int current_pref_max = height[0];
        for (int i = 1 ; i< n ; i++){
            if (height[i] >= current_pref_max){
                current_pref_max = height[i];
            }
            pref[i] = current_pref_max;
        
        }

        int current_suff_max = height[n-1];
        for (int i = n-2 ; i>=0 ; i--){
            if (height[i] >= current_suff_max){
                current_suff_max = height[i];
            }
            suff[i] = current_suff_max;
        
        }

        for (int i = 0 ; i< n ; i++){
            int indexArea =  Math.min(pref[i], suff[i]) - height[i];
            area +=indexArea;
        }

        return area;

    }

}
