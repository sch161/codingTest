class Solution {
    public String solution(String my_string, int[] indices) {
        String arr[] = my_string.split("");
        String result = "";
        for(int i = 0; i < indices.length; i++) {
            arr[indices[i]] = "";
        }
        for(int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }
}