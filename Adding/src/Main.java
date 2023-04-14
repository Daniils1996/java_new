import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enther firs number: ");
        int a = scan.nextInt();

        System.out.println("Enther second number: ");
        int b = scan.nextInt();

        System.out.println(a+b);
    }
}