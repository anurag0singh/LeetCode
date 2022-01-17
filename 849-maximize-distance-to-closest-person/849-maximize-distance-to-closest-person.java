class Solution {
    public int maxDistToClosest(int[] seats) {
        int start = 0, end = 1, max_dist = 0;
        while(end < seats.length){
            if(seats[end] == 1){
                if(seats[start] == 1){
                    max_dist = Math.max(max_dist, (end - start)/2);
                }
                else{
                    max_dist = Math.max(max_dist, (end - start));
                }
                start = end;
            }
            end++;
        }
        max_dist = Math.max(max_dist, (end - start - 1));
        return max_dist;
    }
}