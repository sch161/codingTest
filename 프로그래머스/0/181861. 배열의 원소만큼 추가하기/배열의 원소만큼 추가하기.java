class Solution {
    public int[] solution(int[] arr) {
        int n = 0;
        
        for(int i = 0; i < arr.length; i++) {
            n += arr[i];
        }
        
        int result[] = new int[n];
        int m = 0;
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                result[m++] = arr[i];
            }
        }
        return result;
    }
}