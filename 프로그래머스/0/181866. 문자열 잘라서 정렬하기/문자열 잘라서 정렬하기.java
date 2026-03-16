import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] result = myString.split("x");
        ArrayList<String> list = new ArrayList<>();
        
        for(String s : result){
            if(!s.equals("")){
                list.add(s);
            }
        }
        
        Collections.sort(list);
        
        return list.toArray(new String[list.size()]);
    }
}