import java.util.ArrayList;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = l; i <= r; i++) {
            String s = String.valueOf(i);
            boolean d = true;
            for(int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if(c != '0' && c != '5') {
                    d = false;
                    break;
                }
            }
            if(d) {
                result.add(i);
            }
        }
        if(result.isEmpty()) {
                result.add(-1);
            }
        int[] array = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            array[i] = result.get(i);
        }
        return array;
    }
}