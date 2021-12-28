class Solution {
    public int romanToInt(String str) {
        HashMap<Character, Integer> hashmap = new HashMap<>();
        hashmap.put('I', 1);
        hashmap.put('V', 5);
        hashmap.put('X', 10);
        hashmap.put('L', 50);
        hashmap.put('C', 100);
        hashmap.put('D', 500);
        hashmap.put('M', 1000);
        int len = str.length();
        int res = hashmap.get(str.charAt(len - 1));
        for(int i = len - 2; i >= 0; i--){
            if(hashmap.get(str.charAt(i)) < hashmap.get(str.charAt(i + 1))){
                res -= hashmap.get(str.charAt(i));
            }
            else{
                res += hashmap.get(str.charAt(i));
            }
        }
        return res;
    }
}