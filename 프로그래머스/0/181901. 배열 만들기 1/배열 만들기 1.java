class Solution {
    public int[] solution(int n, int k) {
        int x = 0;
        for(int i = 1; i <= n; i++) {
            if(i % k == 0)
                x++;
        }
        int result[] = new int[x];
        for(int i = 0; i < x; i++) {
            result[i] = k * (i + 1);
        }
        return result;
    }
}