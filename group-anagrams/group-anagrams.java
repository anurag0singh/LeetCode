class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
            List<String> list = new ArrayList<>();
            if(map.containsKey(key)){
                list = map.get(key);
            }
            list.add(str);
            map.put(key, list);
        }
        List<List<String>> res = new ArrayList<>();
        for(String key: map.keySet()){
            res.add(map.get(key));
        }
        return res;
    }
}