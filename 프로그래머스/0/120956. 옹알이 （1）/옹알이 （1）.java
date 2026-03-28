class Solution {
    public int solution(String[] babbling) {
        int sum = 0;
        String arr[] = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++) {
            String word = babbling[i];
            
            for(int j = 0; j < arr.length; j++) {
                word = word.replace(arr[j], " ");
            }
            if(word.trim().equals("")) {
                sum++;
            }
        }
        return sum;
    }
}