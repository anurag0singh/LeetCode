class Solution {
    public int maxProfit(int[] prices) {
        int[] dp = new int[prices.length + 1];
        int buy, sell;
        buy = sell = prices[prices.length - 1];
        int profit = 0;
        for(int i = prices.length - 1; i >= 0; i--){
            if(buy > prices[i]){
                buy = prices[i];
            }
            if(sell < prices[i]){
                sell = prices[i];
                buy = prices[i];
            }
            profit = Math.max(profit, sell - buy);
            dp[i] = profit;
        }
        buy = prices[0];
        profit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] > buy){
                profit = Math.max(profit, dp[i + 1] + prices[i] - buy);
            }
            else{
                buy = prices[i];
            }
        }
        return profit;
    }
}