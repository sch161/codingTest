class Solution {
    public int[] solution(int n, int[] numlist) {
        int count = 0;
        
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0)
                count++;
        }
        int result[] = new int[count];
        count = 0;
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                result[count] = numlist[i];
                count++;
            }
        }
        return result;
    }
}