class Solution {
    public String solution(String str1, String str2) {
        String a[] = str1.split("");
        String b[] = str2.split("");
        String result = "";
        for(int i = 0; i < a.length; i++) {
            result += a[i];
            result += b[i];
        }
        return result;
    }
}