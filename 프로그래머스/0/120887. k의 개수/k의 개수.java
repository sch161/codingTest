class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        char target = (char)(k + '0');
        for (int num = i; num <= j; num++) {
            for (char c : String.valueOf(num).toCharArray()) {
                if (c == target) {
                    count++;
                }
            }
        }
        return count;
    }
}