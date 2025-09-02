import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int n = 0;
        int m = 0;
        if(array.length % 2 != 0) {
            n = array.length / 2;
            return array[n];
        }
        else {
            n = array.length / 2;
            m = array.length / 2 + 1;
            return array[(n + m) / 2];
        }
    }
}