class Solution {
    public int maxProfit(int[] prices) {
        int buy, sell;
        buy = sell = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(buy > prices[i]){
                buy = prices[i];
                sell = prices[i];
            }
            else if(sell < prices[i]){
                sell = prices[i];
                profit = Math.max(profit, sell - buy);
            }
        }
        return profit;
    }
}