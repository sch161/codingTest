class Solution {
    public int solution(int[] sides) {
        int max = 0;
        int result = 0;
        for(int i = 0; i < 3; i++) {
            if(max < sides[i])
                max = sides[i];
            result += sides[i];
        }
        result -= max * 2;
        if(result <= 0) {
            return 2;
        } else {
            return 1;
        }
    }
}