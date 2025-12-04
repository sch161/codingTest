class Solution {
    public String solution(String my_string, int[] index_list) {
        String x[] = my_string.split("");
        String result = "";
        for(int i = 0; i < index_list.length; i++) {
            result += x[index_list[i]];
        }
        return result;
    }
}