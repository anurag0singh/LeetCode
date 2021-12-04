class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] l = new int[n];
        int[] r = new int[n];
        int ma = 0;
        for(int i = 0; i < n; i++) {
            l[i] = ma;
            ma = Math.max(ma, height[i]);
        }
        ma = 0;
        for(int i = n - 1; i >= 0; i--) {
            r[i] = ma;
            ma = Math.max(ma, height[i]);
        }
        int water = 0;
        for(int i = 0; i < n; i++) {
            if(Math.min(l[i], r[i]) > height[i]) {
                water += Math.min(l[i], r[i]) - height[i];
            }
        }
        return water;
    }
}