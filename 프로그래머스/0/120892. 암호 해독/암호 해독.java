class Solution {
    public String solution(String cipher, int code) {
        String arr[] = cipher.split("");
        String result = "";
        for(int i = code - 1; i < arr.length; i += code) {
            result += arr[i];
        }
        return result;
    }
}