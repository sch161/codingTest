import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int arr[] = new int[num_list.length - 5];
        Arrays.sort(num_list);
        int x = 0;
        for(int i = 5; i < num_list.length; i++) {
            arr[x] = num_list[i];
            x++;
        }
        return arr;
    }
}