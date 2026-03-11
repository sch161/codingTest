import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                arr.add(i);
                while(n % i == 0) {
                    n /= i;
                }
            }
        }
        int result[] = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i).intValue();
        }
        return result;
    }
}