class Solution {
    public int[] solution(int start_num, int end_num) {
        int num;
        num = end_num - start_num + 1;
        int arr[] = new int [num];
        for(int i = 0; i < num; i++) {
            arr[i] = start_num;
            start_num++;
        }
        return arr;
    }
}