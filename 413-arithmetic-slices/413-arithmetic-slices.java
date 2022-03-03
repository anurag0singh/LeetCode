class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int i = 1, ans = 0;
        while(i < nums.length){
            int diff = nums[i] - nums[i - 1];
            int count = 1;
            while(i < nums.length && nums[i] - nums[i - 1] == diff){
                count++;
                i++;
            }
            if(count >= 3){
                count -= 2;
                ans += count*(count + 1)/2;
            }
        }
        return ans;
    }
}