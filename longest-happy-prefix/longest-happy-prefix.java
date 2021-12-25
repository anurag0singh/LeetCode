class Solution {
    public String longestPrefix(String s) {
        int len = s.length();
        int[] dp = new int[len];
        int i, j;
        i = 1;
        j = 0;
        while(i < len){
            if(s.charAt(i) == s.charAt(j)){
                dp[i++] = (j++) + 1;
            }
            else if(j == 0){
                i++;
            }
            else{
                j = dp[j - 1];
            }
        }
        return s.substring(0, dp[len - 1]);
    }
}