import java.util.*;
class Solution {
    public int solution(String s) {
        ArrayList<Integer> arr = new ArrayList<>();
        String[] a = s.split(" ");
        
        for(String str : a) {
            if(str.equals("Z")) {
                arr.remove(arr.size() - 1);
            } else {
                arr.add(Integer.parseInt(str));
            }
        }
        int result = 0;
        for(int num : arr) {
            result += num;
        }
        return result;
    }
}