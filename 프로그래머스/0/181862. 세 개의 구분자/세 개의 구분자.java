import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> array = new ArrayList<>();
        String arr[] = myStr.split("[abc]+");
        String x = "";
        for(int i = 0; i < arr.length; i++) {
            if(!arr[i].equals("")) {
                array.add(arr[i]);
            }
            x += arr[i];
        }
        if(x.equals("")) {
            array.add("EMPTY");
        }
        return array.toArray(new String[0]);
    }
}