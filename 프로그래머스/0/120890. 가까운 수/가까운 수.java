class Solution {
    public int solution(int[] array, int n) {
        int result = array[0];
        for(int i = 0; i < array.length; i++) {
            if(Math.abs(array[i] - n) < Math.abs(result - n)) {
                result = array[i];
            } else if(Math.abs(array[i] - n) == Math.abs(result - n) && array[i] < result) {
                result = array[i];
            }
        }
        return result;
    }
}