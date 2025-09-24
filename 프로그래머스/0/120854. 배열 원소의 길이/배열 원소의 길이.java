class Solution {
    public int[] solution(String[] strlist) {
        
        int count[] = new int[strlist.length];
        
        for(int i = 0; i < strlist.length; i++) {
            String s[] = strlist[i].split("");
            count[i] = s.length;
            for(int j = 0; j < s.length; j++)
                s[j] = "";
        }
        
        return count;
    }
}