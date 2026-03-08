import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> array = new ArrayList<>();
        
        if(n == 1) {
            for(int i = 0; i <= slicer[1]; i++) {
                array.add(num_list[i]);
            }
        } else if(n == 2) {
            for(int i = slicer[0]; i < num_list.length; i++) {
                array.add(num_list[i]);
            }
        } else if(n == 3) {
            for(int i = slicer[0]; i <= slicer[1]; i++) {
                array.add(num_list[i]);
            }
        } else if(n == 4) {
            for(int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                array.add(num_list[i]);
            }
        }
        
        int result[] = new int[array.size()];
        for(int i = 0; i < array.size(); i++) {
            result[i] = array.get(i);
        }
        
        return result;
    }
}