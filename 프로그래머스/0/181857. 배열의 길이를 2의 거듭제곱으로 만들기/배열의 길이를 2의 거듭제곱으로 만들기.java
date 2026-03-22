import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> array = new ArrayList<>();
        int n = arr.length;
        int x = (n & (n - 1)) == 0 ? n : Integer.highestOneBit(n) << 1;
        for(int i = 0; i < arr.length; i++) {
            array.add(arr[i]);
        }
        for(int i = arr.length; i < x; i++) {
            array.add(0);
        }
        int[] result = array.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}