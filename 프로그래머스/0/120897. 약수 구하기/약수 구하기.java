import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                array.add(i);
            }
        }
        int[] result = new int[array.size()];
        for (int i = 0 ; i < array.size() ; i++) 
            result[i] = array.get(i).intValue();
        return result;
    }
}