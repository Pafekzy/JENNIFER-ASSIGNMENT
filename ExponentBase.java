
import java.util.Scanner;

public class ExponentBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base number:");
        double base = scanner.nextDouble();

        System.out.println("Enter the exponent:");
        int exponent = scanner.nextInt();

        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
