class Solution {
    static int sum(int[] balances){
        int sum = 0;
        for(int balance: balances) sum += balance;
        return sum;
    }
    
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        for(int[] balance: accounts) res = Math.max(res, sum(balance));
        return res;
    }
}