import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int arr1[] = new int[arr.length];
        int max = 0;
        while(true) {
            for(int j = 0; j < arr.length; j++) {
                arr1[j] = arr[j];
            }
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if(arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            if(Arrays.equals(arr, arr1)) {
                break;
            }
            max++;
        }
        return max;
    }
}