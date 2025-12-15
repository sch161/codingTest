import java.util.ArrayList;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].contains("ad")) {
                list.add(strArr[i]);
            }
        }
        String[] array = new String[list.size()];
        int size = 0;
        for(String temp : list) {
            array[size++] = temp;
        }
        return array;
    }
}