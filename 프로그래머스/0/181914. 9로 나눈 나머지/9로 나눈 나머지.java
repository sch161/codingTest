class Solution {
    public int solution(String number) {
        String arr[] = number.split("");
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            result += Integer.parseInt(arr[i]);
        }
        result %= 9;
        return result;
    }
}