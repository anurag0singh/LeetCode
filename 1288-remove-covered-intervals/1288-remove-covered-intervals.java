class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int count=intervals.length;
 
        for(int i=0;i<intervals.length;i++)
        {
            int a=intervals[i][0];
            int b=intervals[i][1];
            for(int j=0;j<intervals.length;j++)
            {
                int c=intervals[j][0];
                int d=intervals[j][1];
                  if(i!=j && c<=a && b<=d)
                  {
                      count--;
                      break;
                  }
            }
        }
        return count;
    }
}