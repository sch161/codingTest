class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int arr[] = new int[2];
        int x = (board[0] - 1) / 2;
        int y = (board[1] - 1) / 2;
        for(int i = 0; i < keyinput.length; i++) {
            if(keyinput[i].equals("up")) {
                if(arr[1] < y) {
                    arr[1]++;
                }
            } else if(keyinput[i].equals("down")) {
                if(arr[1] > y * -1) {
                    arr[1]--;
                }
            } else if(keyinput[i].equals("left")) {
                if(arr[0] > x * -1) {
                    arr[0]--;
                }
            } else if(keyinput[i].equals("right")) {
                if(arr[0] < x) {
                    arr[0]++;
                }
            }
        }
        return arr;
    }
}