class Solution {
    public int solution(int n) {
        String x = Integer.toString(n);
        String arr[] = x.split("");
        int num[] = Integer.parseInt(arr);
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            result += num[i];
        }
        return result;
    }
}