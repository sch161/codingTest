class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int n = 0;
        for(int i = 0; i < queries.length; i++) {
            for(int j = 0; j < queries[i].length - 1; j++) {
                n = arr[queries[i][j]];
                arr[queries[i][j]] = arr[queries[i][j + 1]];
                arr[queries[i][j + 1]] = n;
            }
        }
        return arr;
    }
}