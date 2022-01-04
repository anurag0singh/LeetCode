class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        for(int i = 0; i < time.length; i++){
            time[i] %= 60;
        }
        int[] dp = new int[60];
        for(int t: time){
            dp[t]++;
        }
        int res = 0;
        res += dp[0] > 0 ? dp[0]*(dp[0] - 1)/2 : 0;
        res += dp[30] > 0 ? dp[30]*(dp[30] - 1)/2 : 0;
        for(int i = 1; i < 30; i++){
            res += dp[i]*dp[60 - i];
        }
        return res;
    }
}