class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int x_rev = 0;
        int tmp = x;
        while(tmp > 0){
            x_rev *= 10;
            x_rev += tmp % 10;
            tmp /= 10;
        }
        if(x_rev == x) return true;
        return false;
    }
}