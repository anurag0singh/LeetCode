class Solution {
    public int countBinarySubstrings(String s) {
        int zeros, ones, count;
        zeros = ones = count = 0;
        if(s.charAt(0) == '1') ones = 1;
        else zeros = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(i - 1)){
                count += Math.min(ones, zeros);
                if(s.charAt(i) == '1') ones = 1;
                else zeros = 1;
            }
            else{
                if(s.charAt(i) == '1') ones++;
                else zeros ++;
            }
        }
        count += Math.min(ones, zeros);
        return count;
    }
}