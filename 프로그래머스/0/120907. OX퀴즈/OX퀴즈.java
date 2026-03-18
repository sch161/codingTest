class Solution {
    public String[] solution(String[] quiz) {
        String result[] = new String[quiz.length];
        
        for(int i = 0; i < result.length; i++) {
            String arr[] = quiz[i].split(" ");
            
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[2]);
            int x = Integer.parseInt(arr[4]);
            int n = 0;
            
            if(arr[1].equals("+")) {
                n = a + b;
            } else {
                n = a - b;
            }
            
            if(n == x) {
                result[i] = "O";
            } else {
                result[i] = "X";
            }
        }
        return result;
    }
}