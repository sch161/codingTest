class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denom = denom1 * denom2;
        int numer = numer1 * denom2 + numer2 * denom1;
        
        int n = 1;
        for(int i = 1; i <= numer && i <= denom; i++) {
            if(denom % i == 0 && numer % i == 0) {
                n = i;
            }
        }
        
        numer = numer / n;
        denom = denom / n;
        int result[] = {numer, denom};
        return result;
    }
}