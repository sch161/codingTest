class Solution {
    public int solution(int hp) {
        int count = 0;
        int x = 0;
        for(int i = 5; i >= 1; i -= 2) {
            x += hp / i;
            count += hp / i;
            hp -= x * i;
            x = 0;
        }
        return count;
    }
}