class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        int need = 0;
        for(int i = 0; i < t.length(); i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
            need++;
        }
        int min_len = Integer.MAX_VALUE, start = 0;
        String res = "";
        for(int i = 0; i < s.length(); i++){
            char key = s.charAt(i);
            if(map.containsKey(key)){
                map.put(key, map.get(key) - 1);
                if(map.get(key) >= 0){
                    need--;
                }
            }
            if(need == 0){
                while(map.getOrDefault(s.charAt(start), -1) < 0){
                    if(map.containsKey(s.charAt(start))){
                        map.put(s.charAt(start), map.get(s.charAt(start)) + 1);
                    }
                    start++;
                }
                int len = i - start + 1;
                if(min_len > len){
                    min_len = len;
                    res = s.substring(start, start + len);
                }
                need++;
                map.put(s.charAt(start), map.get(s.charAt(start)) + 1);
                start++;
            }
        }
        return res;
    }
}