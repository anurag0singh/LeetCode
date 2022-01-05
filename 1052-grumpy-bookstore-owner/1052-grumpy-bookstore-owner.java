class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int max_sum = 0;
        int n = customers.length;
        for(int i = 0; i < n; i++){
            max_sum += i < minutes ? customers[i] : customers[i]*(1 - grumpy[i]);
        }
        int sum = max_sum;
        for(int i = minutes; i < n; i++){
            sum += customers[i]*grumpy[i] - customers[i - minutes]*grumpy[i - minutes];
            max_sum = sum > max_sum ? sum : max_sum;
        }
        return max_sum;
    }
}