class Solution {
    public String solution(String myString, String pat) {
        int x = myString.lastIndexOf(pat);
        String y[] = myString.split("");
        String result = "";
        for(int i = 0; i < x + pat.length(); i++) {
            result += y[i];
        }
        return result;
    }
}