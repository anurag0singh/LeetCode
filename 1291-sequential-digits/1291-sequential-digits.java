class Solution {
    static int digitCount(int n){
        int count = 0;
        while(n > 0){
            n = n / 10;
            count++;
        }
        return count;
    }
    
    static void makeList(int low, int high, int dig, List<Integer> list){
        int x = 1, num = 0, gap = 0;
        while(dig > 0){
            num = (num*10) + (x++);
            gap = (gap*10) + 1;
            dig--;
        }
        while(num % 10 != 0){
            if(num >= low && num <= high){
                list.add(num);
            }
            num += gap;
        }
    }
    
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        int start = digitCount(low), end = digitCount(high);
        for(int i = start; i <= end; i++){
            makeList(low, high, i, list);
        }
        return list;
    }
}