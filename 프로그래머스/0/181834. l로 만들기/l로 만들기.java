class Solution {
    public String solution(String myString) {
        String result = "";
        String arr[] = myString.split("");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("a")) {
                arr[i] = "l";
            }
            else if(arr[i].equals("b")) {
                arr[i] = "l";
            }
            else if(arr[i].equals("c")) {
                arr[i] = "l";
            }
            else if(arr[i].equals("d")) {
                arr[i] = "l";
            }
            else if(arr[i].equals("e")) {
                arr[i] = "l";
            }
            else if(arr[i].equals("f")) {
                arr[i] = "l";
            }
            else if(arr[i].equals("g")) {
                arr[i] = "l";
            }
            else if(arr[i].equals("h")) {
                arr[i] = "l";
            }
            else if(arr[i].equals("i")) {
                arr[i] = "l";
            }
            else if(arr[i].equals("j")) {
                arr[i] = "l";
            }
            else if(arr[i].equals("k")) {
                arr[i] = "l";
            }
            result += arr[i];
        }
        return result;
    }
}