class Solution {
    public int solution(int n) {
        int result = 2;
        double m = Math.sqrt(n);
        
        if(m % 1 == 0) {
            result = 1;
        }
        return result;
    }
}