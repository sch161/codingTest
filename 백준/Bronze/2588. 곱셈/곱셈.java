import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println(x*(y%10));
        System.out.println(x*((y%100 - y%10)/10));
        System.out.println(x*(y%1000 - y%100)/100);
        System.out.println(x*y);
    }
}