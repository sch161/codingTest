class Solution {
    public String solution(String my_string, String alp) {
        String list[] = my_string.split("");
        String result = "";
        for(int i = 0; i < list.length; i++) {
            if(list[i].equals(alp)) {
                list[i] = list[i].toUpperCase();
            }
            result += list[i];
        }
        return result;
    }
}