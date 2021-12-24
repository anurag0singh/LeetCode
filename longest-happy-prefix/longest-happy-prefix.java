class Solution {
    public String longestPrefix(String s) {
        int[] dp = new int[s.length()];
        int i, len;
        i = 1;
        len = 0;
        while(i < s.length()){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                dp[i] = len;
                i++;
            }
            else if(len == 0){
                i++;
            }
            else{
                len = dp[len - 1];
            }
        }
        return s.substring(0, dp[s.length() - 1]);
    }
}