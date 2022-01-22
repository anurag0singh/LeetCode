class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0, fuel = 0, start = 0;
        for(int i = 0; i < gas.length; i++){
            fuel += gas[i] - cost[i];
            sum += gas[i] - cost[i];
            if(fuel < 0){
                start = i + 1;
                fuel = 0;
            }
        }
        return sum >= 0 ? start : -1;
    }
}