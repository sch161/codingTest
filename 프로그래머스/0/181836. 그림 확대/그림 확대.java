class Solution {
    public String[] solution(String[] picture, int k) {
        String result[] = new String[picture.length * k];
        int index = 0;
        for(int i = 0; i < picture.length; i++) {
            String s[] = picture[i].split("");
            String l = "";
            
            for(int j = 0; j < s.length; j++) {
                for(int x = 0; x < k; x++) {
                    l += s[j];
                }
            }
            for(int x = 0; x < k; x++) {
                    result[index++] = l;
            }
        }
        return result;
    }
}