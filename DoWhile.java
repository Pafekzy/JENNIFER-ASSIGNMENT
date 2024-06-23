import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        do {
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("The sum is: " + sum);

            System.out.println("Do you want to repeat? (yes/no)");
            String response = scanner.next();

            if (!response.equalsIgnoreCase("yes")) {
                repeat = false;
            }
            } while (repeat);

            System.out.println("Goodbye!");
           }
           }
