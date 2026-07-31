class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int currentMax = prices[n-1];
        int maxProfit = 0;

        for (int i =n-2 ; i>=0; i--){
            if(prices[i] >= currentMax) {
                currentMax = prices[i];
            }else{
                maxProfit = Math.max(maxProfit,currentMax - prices[i]);
            }
        }
        return maxProfit;
    }
}

//this is a dyanamic programming








