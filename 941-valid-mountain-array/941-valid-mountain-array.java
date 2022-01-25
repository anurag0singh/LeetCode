class Solution {
    public boolean validMountainArray(int[] arr) {
        int len = arr.length;
        if(len < 3) return false;
        int i = 1;
        while(i < len && arr[i - 1] < arr[i]){
            i++;
        }
        if(i == len || i == 1) return false;
        while(i < len && arr[i - 1] > arr[i]){
            i++;
        }
        return i == len;
    }
}