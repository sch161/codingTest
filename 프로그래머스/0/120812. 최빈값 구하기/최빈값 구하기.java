import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int result = 0;
        int max = array[array.length - 1];
        int count[] = new int[max + 1];
        for(int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        
        int maxcount = count[0];
        for(int i = 1; i < count.length; i++) {
            if(maxcount < count[i]) {
                maxcount = count[i];
                result = i;
            } else if(maxcount == count[i]) {
                result = -1;
            }
        }
        return result;
    }
}