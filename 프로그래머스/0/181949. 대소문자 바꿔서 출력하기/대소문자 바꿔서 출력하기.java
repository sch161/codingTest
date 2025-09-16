import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String[] arr = a.split("");
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(arr[i].toUpperCase()))
                arr[i] = arr[i].toLowerCase();
            else if(arr[i].equals(arr[i].toLowerCase()))
                arr[i] = arr[i].toUpperCase();
        }
        String result = "";
        for(int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        System.out.print(result);
    }
}