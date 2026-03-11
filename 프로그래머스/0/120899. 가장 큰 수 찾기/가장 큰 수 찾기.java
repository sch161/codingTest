class Solution {
    public int[] solution(int[] array) {
        int result[] = new int [2];
        int max = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                result[1] = i;
            }
        }
        result[0] = max;
        return result;
    }
}