class Solution {
    public int solution(int[] num_list) {
        String a = "";
        String b = "";
        String list[] = new String[num_list.length];
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                list[i] = String.valueOf(num_list[i]);
                a += list[i];
            } else {
                list[i] = String.valueOf(num_list[i]);
                b += list[i];
            }
        }
        int x = Integer.valueOf(a);
        int y = Integer.valueOf(b);
        return x + y;
    }
}