class Solution {
    public String solution(String polynomial) {
        String arr[] = polynomial.split(" \\+ ");
        int x = 0;
        int n = 0;
        String result = "";
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].contains("x")) {
                String num = arr[i].replace("x", "");
                if(num.equals("")) x += 1;
                else x += Integer.parseInt(num);
            }
            else
                n += Integer.parseInt(arr[i]);
        }
        if(x != 0 && n != 0) {
            if(x == 1)
                result += "x";
            else
                result += x + "x";
        result += " + ";
        result += n;
        } else if(x == 0 && n != 0){
            result += n;
        } else {
            if(x == 1)
                result += "x";
            else
                result += x + "x";
}
        return result;
    }
}