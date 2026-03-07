class Solution {
    public String solution(String my_string, int s, int e) {
        String result[] = my_string.split("");
        String temp = "";
        String r ="";
        for(int i = s; i <= e; i++) {
            temp = result[s];
            result[s] = result[e];
            result[e] = temp;
            
            s++;
            e--;
        }
        for(int i = 0; i < result.length; i++) {
            r += result[i];
        }
        return r;
    }
}