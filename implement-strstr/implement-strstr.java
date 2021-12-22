class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        if(len == 0) return 0;
        if(needle.length() > haystack.length()) return -1;
        for(int i = 0; i <= haystack.length() - len; i++){
            if((haystack.substring(i, i + len)).equals(needle)) return i;
        }
        return -1;
    }
}