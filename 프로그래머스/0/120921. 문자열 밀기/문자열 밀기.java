class Solution {
    public int solution(String A, String B) {
        if(A.equals(B)) return 0;
        String b = B + B;
        return b.indexOf(A);
    }
}