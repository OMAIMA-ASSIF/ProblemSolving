class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        int low = 1;
        int high = max;

        while(low<=high){
            int k = low + (high-low)/2;

            int totalh=0;
            for (int i=0; i<piles.length; i++){
                totalh+= (piles[i] + k - 1) / k; 
            }

            if(totalh<=h){
                high = k - 1;
            }else{
                low = k + 1;
            }
        }

        return low;
    }
}
