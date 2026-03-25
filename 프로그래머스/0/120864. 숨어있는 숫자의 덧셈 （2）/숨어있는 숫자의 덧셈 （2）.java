class Solution {
    public int solution(String my_string) {
        String arr[] = my_string.split("[^0-9]+");
        int result = 0;
        for(String s : arr) {
            if(!s.equals("")) {
                result += Integer.parseInt(s);
            }
        }
        return result;
    }
}