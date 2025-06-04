class Solution {
    public int solution(int n) {
        int x = 0;
        if (n % 2 != 0) {
            for(int i = 1; i <= n; i += 2)
                x += i;
        }
        else {
            for(int i = 2; i <= n; i += 2)
                x += i * i;
        }
        return x;
    }
}