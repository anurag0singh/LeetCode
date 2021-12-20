class Solution {
    public int countBinarySubstrings(String s) {
        int zeros, ones, count;
        zeros = ones = count = 0;
        char flag = s.charAt(0);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != flag){
                count += Math.min(ones, zeros);
                if(s.charAt(i) == '1') ones = 1;
                else zeros = 1;
                flag = s.charAt(i);
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