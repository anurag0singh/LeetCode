class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1, j = 1;
        boolean flag = false;
        while(i < nums.length){
            if(flag){
                while(i < nums.length && nums[i] == nums[i - 1]) i++;
                if(i >= nums.length) break;
                flag = false;
            }
            if(nums[i] == nums[i - 1]) flag = true;
            nums[j++] = nums[i++];
        }
        return j;
    }
}