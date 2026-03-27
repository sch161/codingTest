import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int r = 1; r <= rank.length; r++) {
            for(int i = 0; i < rank.length; i++) {
            if(rank[i] == r && attendance[i]) {
                list.add(i);
            }
            if(list.size() == 3) break;
            }
        }
        return (list.get(0) * 10000) + (list.get(1) * 100) + list.get(2);
    }
}