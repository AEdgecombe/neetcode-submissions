class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = prices[0];
        
        // consider i the sell value for each i 
        for(int i = 1; i < prices.length; i++){
           if(prices[i] - minPrice > profit){
            profit = prices[i] - minPrice;
           }
           if(prices[i] < minPrice){
            minPrice = prices[i];
           }
        }

        return profit;
    }
}