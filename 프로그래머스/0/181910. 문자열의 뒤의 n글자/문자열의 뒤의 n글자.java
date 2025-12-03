class Solution {
    public String solution(String my_string, int n) {
        String str[] = my_string.split("");
        String result = "";
        for(int i = (str.length - n); i < str.length; i++) {
            result += str[i];
        }
        return result;
    }
}