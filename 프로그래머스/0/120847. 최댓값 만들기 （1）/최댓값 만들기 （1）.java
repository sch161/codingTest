class Solution {
    public int solution(int[] numbers) {
        int x = 0, y = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > x) {
                y = x;
                x = numbers[i];
            }
            else if(numbers[i] > y) {
                 y = numbers[i];
            }
        }
        return x * y;
    }
}