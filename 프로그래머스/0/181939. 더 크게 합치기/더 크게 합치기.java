class Solution {
    public int solution(int a, int b) {
        
        String a1 = String.valueOf(a);
        String b1 = String.valueOf(b);
        
        String result = "";
        String result1 = "";
        
        result = a1 + b1;
        result1 = b1 + a1;
        
        int x = Integer.parseInt(result);
        int y = Integer.parseInt(result1);
        
        if(x > y)
            return x;
        else if(x < y)
            return y;
        else return x;
    }
}