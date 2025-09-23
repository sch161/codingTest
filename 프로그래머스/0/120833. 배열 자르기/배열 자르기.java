class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int count = 0;
        for(int i = num1; i <= num2; i++) {
            count++;
        }
        int arr[] = new int[count];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = numbers[i + num1];
        }
        return arr;
    }
}