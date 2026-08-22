class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length==0){
            return 0;
        }
        int n = prices.length;
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i = 1; i<n; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            else{
                maxProfit = Math.max(prices[i] - minPrice, maxProfit);
            }
        }
        return maxProfit;
    }
}