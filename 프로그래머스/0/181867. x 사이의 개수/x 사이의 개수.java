class Solution {
    public int[] solution(String myString) {
        String n[] = myString.split("x", -1);
        int result[] = new int[n.length];
        for(int i = 0; i < n.length; i++) {
            result[i] = n[i].length();
        }
        return result;
    }
}