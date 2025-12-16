class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int result = 0;
        if(ineq.equals("<") && eq.equals("=")) {
            result = (n <= m) ? 1 : 0;
        }
        else if(ineq.equals(">") && eq.equals("=")) {
            result = (n >= m) ? 1 : 0;
        }else if(ineq.equals("<") && eq.equals("!")) {
            result = (n < m) ? 1 : 0;
        }
        else if(ineq.equals(">") && eq.equals("!")) {
            result = (n > m) ? 1 : 0;
        }
        return result;
    }
}