class Solution {
    public int[] solution(int[] num_list) {
        int result[] = new int[num_list.length];
        for(int i = result.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = num_list[i];
        }
        return result;
    }
}