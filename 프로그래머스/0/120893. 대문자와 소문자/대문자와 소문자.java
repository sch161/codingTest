class Solution {
    public String solution(String my_string) {
        String arr[] = my_string.split("");
        String result = "";
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == arr[i].toUpperCase()) {
                arr[i] = arr[i].toLowerCase();
                result += arr[i];
            } else {
                arr[i] = arr[i].toUpperCase();
                result += arr[i];
            }
        }
        return result;
    }
}