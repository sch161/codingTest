import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        int result = 0;
        if(x == y && y == z) {
            result = 10000 + (x * 1000);
        }
        else if(x != y && y == z) {
            result = 1000 + (y * 100);
        }
        else if(x == y && y != z) {
            result = 1000 + (x * 100);
        }
        else if(x == z && y != z) {
            result = 1000 + (x * 100);
        }

        else {
            if(x > y && x > z)
                result = x * 100;
            else if(x < y && y > z)
                result = y * 100;
            else if(x < z && y < z)
                result = z * 100;
        }
        System.out.println(result);
    }
}