class Solution {
    public String solution(int age) {
        String s = String.valueOf(age);
        int number[] = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            number[i] = s.charAt(i) - '0';
        }

        String alphabet[] = new String[10];

        for(int i = 0; i < 10; i++) {
            alphabet[i] = String.valueOf((char) ('a' + i));
        }

        String result = "";

        for(int i = 0; i < number.length; i++) {
            for(int j = 0; j < alphabet.length; j++) {
                if(number[i] == j) {
                    result += alphabet[j];
                }
            }
        }
        return result;
    }
}