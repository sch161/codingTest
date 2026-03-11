import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> r = new ArrayList<>();
        int x = -1;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2)
                array.add(i);
        }
        if(array.size() == 0) {
            return new int[]{-1};
        }
        for(int i = array.get(0); i <= array.get(array.size() - 1); i++) {
            r.add(arr[i]);
        }
        return r.stream().mapToInt(i -> i).toArray();
    }
}