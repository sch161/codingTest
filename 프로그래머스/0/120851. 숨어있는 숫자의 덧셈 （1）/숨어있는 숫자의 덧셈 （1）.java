class Solution {
    public int solution(String my_string) {
        String arr[] = my_string.split("");
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].matches("\\d+")) {
                result += Integer.parseInt(arr[i]);
            }
        }
        return result;
    }
}