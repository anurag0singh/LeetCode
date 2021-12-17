class Solution {
    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    static void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start++, end--);
        }
    }
    public void nextPermutation(int[] nums) {
        int idx1 = nums.length - 1;
        while(idx1 > 0 && nums[idx1 - 1] >= nums[idx1]){
            idx1--;
        }
        if(idx1 == 0){
            reverse(nums, 0, nums.length - 1);
            return;
        }
        int idx2 = nums.length - 1;
        while(idx2 > 0 && nums[idx1 - 1] >= nums[idx2]){
            idx2--;
        }
        System.out.print(idx1 - 1 + " " + idx2);
        swap(nums, idx1 - 1, idx2);
        reverse(nums, idx1, nums.length - 1);
    }
}