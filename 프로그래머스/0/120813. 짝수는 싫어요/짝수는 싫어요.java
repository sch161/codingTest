class Solution {
    public int[] solution(int n) {
        if(n % 2 != 0)
            n += 1;
        int result[] = new int[n / 2];

        for(int i = 0; i < result.length; i++) {
            result[i] = 1 + (i * 2);
        }
        return result;
    }
}