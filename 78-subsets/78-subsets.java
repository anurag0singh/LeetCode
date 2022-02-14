class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        list.add(tmp);
        for(int num: nums){
            int len = list.size();
            for(int i = 0; i < len; i++){
                tmp = new ArrayList<Integer>(list.get(i));
                tmp.add(num);
                list.add(tmp);
            }
        }
        return list;
    }
}