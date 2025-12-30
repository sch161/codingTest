class Solution {
    public int solution(int n) {
        int max = 1;
        int result = 0;
        for(int i = 1; i <= Integer.MAX_VALUE; i++) {
            max *= i;
            if(max == n) {
                result = i;
                break;
            }
            else if(max > n) {
                result = i - 1;
                break;
            }
        }
        return result;
    }
}