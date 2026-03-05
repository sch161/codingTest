import java.util.Arrays;
class Solution {
    public String[] solution(String my_string) {
        String x[] = my_string.split("");
        String s = "";
        String result[] = new String[x.length];
        int n = 0;
        for(int i = x.length - 1; i >= 0; i--) {
            s = x[i] + s;
            result[n] = s;
            n++;
        }
        Arrays.sort(result);
        return result;
    }
}