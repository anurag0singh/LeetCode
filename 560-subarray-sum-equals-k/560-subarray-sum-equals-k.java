class Solution {
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        int[] dp = new int[len + 1];
        for(int i = 1; i < len + 1; i++) dp[i] = dp[i - 1] + nums[i - 1];
        int count = 0;
        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len + 1; j++){
                if(dp[j] - dp[i] == k) count++;
            }
        }
        return count;
    }
}