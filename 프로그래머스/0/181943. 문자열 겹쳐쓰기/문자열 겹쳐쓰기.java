class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String[] x = my_string.split("");
        String[] y = overwrite_string.split("");

        for (int i = s; i < s + y.length; i++) {
            x[i] = y[i - s];
        }

        String result = "";
        for (int i = 0; i < x.length; i++) {
            result += x[i];
        }

        return result;
    }
}