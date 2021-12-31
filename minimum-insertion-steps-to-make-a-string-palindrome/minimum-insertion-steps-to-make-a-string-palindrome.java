class Solution {
    public int minInsertions(String s) {
        int len = s.length();
        int[][] dp = new int[len + 1][len + 1];
        char[] chrr = s.toCharArray();
        for(int i = 1; i <= len; i++){
            for(int j = 1; j <= len; j++){
                dp[i][j] = chrr[i - 1] == chrr[len - j] ? dp[i - 1][j - 1] + 1 : Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return len - dp[len][len];
    }
}