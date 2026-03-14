import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> array = new ArrayList<>();
        for(int i = 0; i < names.length; i += 5) {
            array.add(names[i]);
        }
        String[] result = array.toArray(new String[array.size()]);
        return result;
    }
}