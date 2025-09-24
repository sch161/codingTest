class Solution {
    public String solution(String rsp) {
        String arr[] = rsp.split("");
        String result = "";
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("2")) {
                result += "0";
            }
            else if(arr[i].equals("5")) {
                result += "2";
            } else {
                result += "5";
            }
        }
        return result;
    }
}