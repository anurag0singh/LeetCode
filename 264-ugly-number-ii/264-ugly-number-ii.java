class Solution {
    public int nthUglyNumber(int n) {
        int i = 0, j = 0, k = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        int fact2 = 2, fact3 = 3, fact5 = 5;
        for(int idx = 1; idx < n; idx++){
            int min = Math.min(fact2, Math.min(fact3, fact5));
            dp[idx] = min;
            if(min == fact2) fact2 = 2*dp[++i];
            if(min == fact3) fact3 = 3*dp[++j];
            if(min == fact5) fact5 = 5*dp[++k];
        }
        return dp[n - 1];
    }
}