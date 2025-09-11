class Solution {
    public int solution(int n) {
        int p = 1;
        while (true) {
            if ((p * 6) % n == 0) {
                return p;
            }
            p++;
        }
    }
}