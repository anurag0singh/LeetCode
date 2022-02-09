class Solution {
    public int findPairs(int[] nums, int k) {
        Set<Pair<Integer, Integer>> set = new HashSet<>();
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(Math.abs(nums[i] - nums[j]) == k){
                    int min = Math.min(nums[i], nums[j]);
                    int max = Math.max(nums[i], nums[j]);
                    Pair<Integer, Integer> p = new Pair<>(min, max);
                    set.add(p);
                }
            }
        }
        return set.size();
    }
}