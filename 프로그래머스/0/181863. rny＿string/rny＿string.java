class Solution {
    public String solution(String rny_string) {
        String arr[] = rny_string.split("");
        String result = "";
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("m")) {
                arr[i] = "rn";
            }
            result += arr[i];
        }
        return result;
    }
}