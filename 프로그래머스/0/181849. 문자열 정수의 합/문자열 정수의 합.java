class Solution {
    public int solution(String num_str) {
        String arr[] = num_str.split("");
        int result[] = new int[arr.length];
        int n = 0;
        for(int i = 0; i < arr.length; i++) {
            result[i] = Integer.valueOf(arr[i]);
            n += result[i];
        }
        return n;
    }
}