class Solution {
    public String solution(String my_string) {
        String x[] = my_string.split("");
        String result = "";
        for(int i = x.length - 1; i >= 0; i--) {
            result += x[i];
        }
        return result;
    }
}