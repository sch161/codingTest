class Solution {
    public int solution(int[] array) {
        int result = 0;
        for(int i = 0; i < array.length; i++) {
            String x = String.valueOf(array[i]);
            String arr[] = x.split("");
            for(int j = 0; j < arr.length; j++) {
                if(arr[j].equals("7")) {
                    result++;
                }
            }
        }
        return result;
    }
}