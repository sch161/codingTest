class Solution {
    public String solution(String n_str) {
        int x = 0;
        String result = "";
        String arr[] = n_str.split("");
        for(int i = 0; i < arr.length; i++) {
            if(!arr[i].equals("0")) {
                x = i;
                break;
            }
        }
        for(int i = x; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }
}