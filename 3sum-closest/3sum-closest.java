class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE, res = 0;
        for(int i = 0; i < nums.length - 2; i++){
            int start = i + 1, end = nums.length - 1;
            while(start < end){
                int sum = nums[start] + nums[end] + nums[i];
                if(min > Math.abs(target - sum)){
                    min = Math.abs(target - sum);
                    res = sum;
                }
                if(sum == target){
                    return res;
                }
                else if(sum > target){
                    end--;
                }
                else{
                    start++;
                }
            }
        }
        return res;
    }
}