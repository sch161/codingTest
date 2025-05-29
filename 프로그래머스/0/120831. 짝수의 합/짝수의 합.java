class Solution {
    public int solution(int n) {
        int x = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0)
                x += i;
        }
        int answer = x;
        return answer;
    }
}