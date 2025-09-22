class Solution {
    public String solution(String my_string, String letter) {
        String arr[] = my_string.split("");
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(letter)) {
                count++;
            }
        }
        String result = "";
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(letter)) {
                continue;
            } else {
                result += arr[i];
            }
        }
        return result;
    }
}