class Solution {
    static int N = 10000;
    public int deleteAndEarn(int[] nums) {
        int[] sum = new int[N];
        int[] dp = new int[N + 2];
        for(int i: nums){
            sum[i - 1] += i;
        }
        dp[N - 1] = sum[N - 1];
        for(int i = N - 2; i >= 0; i--){
            dp[i] = Math.max(sum[i] + dp[i + 2], sum[i + 1] + dp[i + 3]);
        }
        return dp[0];
    }
}