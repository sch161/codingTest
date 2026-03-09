import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> array = new ArrayList<>();
        
        for(int i = 0; i < intervals.length; i++) {
            for(int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                array.add(arr[j]);
            }
        }
        int[] result = new int[array.size()];
        for (int i = 0 ; i < array.size() ; i++) 
            result[i] = array.get(i).intValue();
        return result;
    }
}