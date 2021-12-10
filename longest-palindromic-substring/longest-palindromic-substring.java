class Solution {
    public String longestPalindrome(String s) {
        int maxlen = 1;
        String res = "" + s.charAt(0);
        
        // odd pallindromes
        
        for(int i = 0; i < s.length(); i++){
            int l, r;
            l = i - 1;
            r = i + 1;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if(maxlen < r - l + 1){
                    maxlen = r - l + 1;
                    res = s.substring(l, r + 1);
                }
                l--;
                r++;
            }
        }
        
        // even pallindromes
        
        for(int i = 0; i < s.length(); i++){
            int l, r;
            l = i;
            r = i + 1;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if(maxlen < r - l + 1){
                    maxlen = r - l + 1;
                    res = s.substring(l, r + 1);
                }
                l--;
                r++;
            }
        }
        
        return res;
    }
}