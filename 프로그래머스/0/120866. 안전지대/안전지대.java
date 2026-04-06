class Solution {
    public int solution(int[][] board) {
        int result = 0;
        int arr[][] = new int[board.length + 2][board.length + 2];
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 1) {
                    arr[i + 1][j + 1] = 1;
                }
            }
        }
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 1) {
                    arr[i][j] = 1;
                    arr[i][j + 1] = 1;
                    arr[i][j + 2] = 1;

                    arr[i + 1][j] = 1;
                    arr[i + 1][j + 1] = 1;
                    arr[i + 1][j + 2] = 1;

                    arr[i + 2][j] = 1;
                    arr[i + 2][j + 1] = 1;
                    arr[i + 2][j + 2] = 1;
                }
            }
        }
        for(int i = 1; i < board.length + 1; i++) {
            for(int j = 1; j < board.length + 1; j++) {
                if(arr[i][j] == 0) {
                    result++;
                }
            }
        }
        return result;
    }
}