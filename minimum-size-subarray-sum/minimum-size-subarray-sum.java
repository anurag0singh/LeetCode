class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start, sum;
        start = sum = 0;
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while(sum >= target) {
                res = Math.min(res, i - start + 1);
                sum -= nums[start];
                start++;
            }
        }
        if(res < Integer.MAX_VALUE) {
            return res;
        }
        else {
            return 0;
        }
    }
}