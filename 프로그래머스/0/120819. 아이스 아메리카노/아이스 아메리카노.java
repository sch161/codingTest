class Solution {
    public int[] solution(int money) {
        int result[] = new int[2];
        while(money >= 5500) {
            money -= 5500;
            result[0]++;
        }
        result[1] = money;
        return result;
    }
}