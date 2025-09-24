import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        String arr[] = my_string.split("");
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].matches("\\d+")) {
                count++;
            }
        }
        int arr2[] = new int[count];
        int length = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].matches("\\d+")) {
                arr2[length] = Integer.parseInt(arr[i]);
                length++;
            }
        }
        Arrays.sort(arr2);
        return arr2;
    }
}