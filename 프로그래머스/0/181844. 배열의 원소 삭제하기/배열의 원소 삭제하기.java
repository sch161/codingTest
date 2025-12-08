import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> r = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            boolean found = false;
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    found = true;
                }
            }
            if(!found) {
                r.add(arr[i]);
            }
        }
        int result[] = new int[r.size()];
        for(int i = 0; i < r.size(); i++) {
            result[i] = r.get(i);
        }
        return result;
    }
}