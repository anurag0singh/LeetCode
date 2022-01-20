class Solution {
    static boolean isValid(int[] piles, int h, int mid){
        int hr = 0;
        for(int i = 0; i < piles.length; i++){
            hr += (piles[i] + mid - 1)/mid;
            if(hr > h) return false;
        }
        return true;
    }
    
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 1000000000;
        while(low <= high){
            int mid = (low + high)/2;
            if(isValid(piles, h, mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}