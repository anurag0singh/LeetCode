class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] pat = s.split(" ");
        char[] a = pattern.toCharArray();
        if(a.length != pat.length) return false;
        HashMap<Character, String> map = new HashMap<>();
        for(int i = 0; i < a.length; i++){
            if(map.containsKey(a[i])){
                if(!pat[i].equals(map.get(a[i]))) return false;
            }
            else{
                if(map.containsValue(pat[i])) return false;
                map.put(a[i], pat[i]);
            }
        }
        return true;
    }
}