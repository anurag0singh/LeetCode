class Solution {
    static String say(String res) {
        int i = 0;
        int count = 0;
        String s = "";
        while(i < res.length()) {
            char start = res.charAt(i);
            while(i < res.length() && start == res.charAt(i)) {
                count++;
                i++;
            }
            s += count;
            s += start;
            count = 0;
        }
        return s;
    }
    
    public String countAndSay(int n) {
        String res = "1";
        for(int i = 1; i < n; i++) {
            res = say(res);
        }
        return res;
    }
}