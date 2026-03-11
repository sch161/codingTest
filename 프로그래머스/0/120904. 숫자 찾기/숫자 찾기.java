class Solution {
    public int solution(int num, int k) {
        String n = String.valueOf(num);
        String arr[] = n.split("");
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(String.valueOf(k))) {
                result = i + 1;
                break;
            } else {
                result = -1;
            }
        }
        return result;
    }
}