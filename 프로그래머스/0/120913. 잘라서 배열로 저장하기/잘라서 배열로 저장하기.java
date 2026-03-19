class Solution {
    public String[] solution(String my_str, int n) {
        String result[] = my_str.split("(?<=\\G.{" + n + "})");
        return result;
    }
}