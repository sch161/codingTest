class Solution {
    public int solution(int n, int k) {
        int result = 0;
        int m = 0;
        result += n * 12000;
        result += k * 2000;
        if(n >= 10) {
            m = n / 10;
        }
        result -= m * 2000;
        return result;
    }
}