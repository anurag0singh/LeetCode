class Solution {
    public int minSwaps(String s) {
        int max_close, close;
        close = max_close = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ']'){
                close++;
            }
            else{
                close--;
            }
            max_close = Math.max(max_close, close);
        }
        return (max_close + 1) / 2;
    }
}