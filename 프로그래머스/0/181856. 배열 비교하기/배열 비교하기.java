class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int result = 0;
        int x = 0, y = 0;
        if(arr1.length > arr2.length) {
            result = 1;
        }
        else if(arr1.length < arr2.length) {
            result = -1;
        }
        else if(arr1.length == arr2.length) {
            for(int i = 0; i < arr1.length; i++) {
                x += arr1[i];
                y += arr2[i];
            }
            if(x > y) {
                result = 1;
            }
            else if(x < y) {
                result = -1;
            }
            else {
                result = 0;
            }
        }
        return result;
    }
}