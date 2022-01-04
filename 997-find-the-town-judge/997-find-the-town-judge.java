class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] dp = new int[n];
        for(int i = 0; i < trust.length; i++){
            dp[trust[i][0] - 1]--;
            dp[trust[i][1] - 1]++;
        }
        for(int i = 0; i < n; i++){
            if(dp[i] == n - 1) return i + 1;
        }
        return -1;
    }
}