class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String result = "";
        for(int i = 0; i < my_strings.length;i++) {
            String x[] = my_strings[i].split("");
            for(int j = parts[i][0]; j <= parts[i][1]; j++) {
                result += x[j];
            }
        }
        return result;
    }
}