class Solution {
    public int[][] solution(int[][] arr) {
        int n = 0;
        int m = 0;
        if(arr.length > arr[0].length) {
            n = arr.length;
            m = arr.length;
        }
        else if(arr.length < arr[0].length) {
            n = arr[0].length;
            m = arr[0].length;
        }
        else {
            n = arr[0].length;
            m = arr.length;
        }
        int result[][] = new int[m][n];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                result[i][j] = arr[i][j];
            }
        }
        return result;
    }
}