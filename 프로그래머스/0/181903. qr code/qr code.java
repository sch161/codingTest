class Solution {
    public String solution(int q, int r, String code) {
        String arr[] = code.split("");
        String result = "";
        for(int i = 0; i < arr.length; i++) {
            if(i % q == r) {
                result += arr[i];
            }
        }
        return result;
    }
}