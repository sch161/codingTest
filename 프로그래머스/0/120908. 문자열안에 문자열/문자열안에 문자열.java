class Solution {
    public int solution(String str1, String str2) {
        int result = 2;
        if(str1.contains(str2)) {
            result = 1;
        }
        return result;
    }
}