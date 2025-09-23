class Solution {
    public int[] solution(int[] emergency) {
        int num[] = new int [emergency.length];
        
        for(int i = 0; i < emergency.length; i++) {
            int max = 1;
            for(int j = 0; j < emergency.length; j++) {
                if(emergency[i] < emergency[j]) {
                    max++;
                }
            }
            num[i] = max;
        }
        return num;
    }
}