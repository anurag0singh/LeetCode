class Solution {
    public int addDigits(int num) {
        int sum = 0;
        while(num >= 10){
            sum += num % 10;
            num = num / 10;
            if(num < 10){
                num = sum + num;
                sum = 0;
            }
        }
        return num;
    }
}