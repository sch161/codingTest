import java.util.*;
class Solution {
    public int solution(String before, String after) {
        String a[] = after.split("");
        String b[] = before.split("");
        Arrays.sort(a);
        Arrays.sort(b);
        int result = 1;
        
        for(int i = 0; i < a.length; i++) {
            if(!a[i].equals(b[i])) {
                result = 0;
            }
        }
        return result;
    }
}