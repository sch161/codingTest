class Solution {
    public int[][] solution(int[] num_list, int n) {
        int width = num_list.length / n;
        int height = n;
        int arr[][] = new int[width][height];
        
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                arr[i][j] = num_list[i * n + j];
            }
        }
        return arr;
    }
}