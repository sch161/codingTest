class Solution {
    public int[][] solution(int n) {
        int arr[][] = new int[n][n];
        
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int num = 1;
        while(true) {
            for(int i = left; i <= right; i++) {
                arr[top][i] = num++;
            }
            if(++top > bottom) break;
            
            for(int i = top; i <= bottom; i++) {
                arr[i][right] = num++;
            }
            if(--right < left) break;
            
            for(int i = right; i >= left; i--) {
                arr[bottom][i] = num++;
            }
            if(--bottom < top) break;
            
            for(int i = bottom; i >= top; i--) {
                arr[i][left] = num++;
            }
            if(++left > right) break;
        }
        return arr;
    }
}