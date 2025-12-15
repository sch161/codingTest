class Solution {
    public int solution(int[] num_list) {
        int x = 0, y = 0;
        for(int i = 0; i < num_list.length; i++) {
            if(i % 2 == 0) {
                x += num_list[i];
            } else {
                y += num_list[i];
            }
        }
        if(x > y) {
            return x;
        }
        else {
            return y;
        }
    }
}