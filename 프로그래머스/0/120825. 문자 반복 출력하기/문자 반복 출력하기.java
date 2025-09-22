class Solution {
    public String solution(String my_string, int n) {
        String x[] = my_string.split("");
        String result = "";
        for(int i = 0; i < x.length; i++) {
            for(int j = 0; j < n; j++) {
                result += x[i];
            }
        }
        return result;
    }
}