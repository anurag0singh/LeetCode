class Solution {
    public int minMoves(int target, int maxDoubles) {
        int moves = 0;
        while(target > 1 && maxDoubles > 0){
            moves += target % 2 + 1;
            target = target / 2;
            maxDoubles--;
        }
        return moves + target - 1;
    }
}