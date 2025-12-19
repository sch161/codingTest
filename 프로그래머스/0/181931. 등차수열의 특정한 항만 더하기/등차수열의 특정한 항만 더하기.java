class Solution {
    public int solution(int a, int d, boolean[] included) {
        int max = 0;
        for(int i = 0; i < included.length; i++) {
            int n = a + d * i;
            if(included[i]) {
                max += n;
            }
        }
        return max;
    }
}