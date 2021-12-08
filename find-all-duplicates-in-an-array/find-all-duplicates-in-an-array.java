class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int idx : nums) {
            idx = idx < 0 ? -(idx + 1) : (idx - 1);
            if(nums[idx] < 0) {
                list.add(idx + 1);
            }
            else {
                nums[idx] = -nums[idx];
            }
        }
        return list;
    }
}