class Solution {
    public int solution(String binomial) {
        String arr[] = binomial.split(" ");
        int result = 0;
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        if(arr[1].equals("+")) {
            result = a + b;
        } else if(arr[1].equals("-")) {
            result = a - b;
        } else if(arr[1].equals("*")) {
            result = a * b;
        }
        return result;
    }
}