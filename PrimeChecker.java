import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        if (num >= 2 && num <= 3) {
            System.out.println(num + " is a prime number.");


        if (num % 2 != 0 && num % 3 != 0) {
            System.out.println(num + " is a prime number.");
         }
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
    }
