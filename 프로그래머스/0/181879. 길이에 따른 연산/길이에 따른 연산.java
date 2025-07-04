class Solution {
    public int solution(int[] num_list) {
        int result = 1;
        if(num_list.length > 10) {
            for(int i = 0; i < num_list.length; i++) {
                result += num_list[i];
            }
            result--;
        }
        else
            for(int i = 0; i < num_list.length; i++) {
                result *= num_list[i];
            }
        return result;
    }
}