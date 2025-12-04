class Solution {
    public int solution(int a, int b) {
        int y = 2 * a * b;
        String n = String.valueOf(a);
        String m = String.valueOf(b);
        String z = n + m;
        int x = Integer.valueOf(z);
        if(x >= y) {
            return x;
        } else {
            return y;
        }
    }
}