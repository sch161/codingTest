class Solution {
    public int solution(int order) {
        String n[] = String.valueOf(order).split("");
        int result = 0;
        for(int i = 0; i < n.length; i++) {
            if(n[i].equals("3") || n[i].equals("6") || n[i].equals("9")) {
                result++;
            }
        }
        return result;
    }
}