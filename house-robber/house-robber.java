class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len + 3];
        dp[len - 1] = nums[len - 1];
        for(int i = len - 2; i >= 0; i--){
            dp[i] = Math.max(nums[i] + dp[i + 2], nums[i + 1] + dp[i + 3]);
        }
        return dp[0];
    }
}