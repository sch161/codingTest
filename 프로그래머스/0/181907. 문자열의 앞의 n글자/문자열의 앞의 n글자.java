class Solution {
    public String solution(String my_string, int n) {
        String result = "";
        String str[] = my_string.split("");
        for(int i = 0; i < n; i++) {
            result += str[i];
        }
        return result;
    }
}