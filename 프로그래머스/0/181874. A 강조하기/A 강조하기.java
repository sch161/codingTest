class Solution {
    public String solution(String myString) {
        myString = myString.toLowerCase();
        String arr[] = myString.split("");
        String result = "";
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("a")) {
                arr[i] = "A";
            }
            result += arr[i];
        }
        return result;
    }
}