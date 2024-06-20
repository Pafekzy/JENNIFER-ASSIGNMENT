import java.util.Scanner;

public class TestPositiveNegativeZeroCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        System.out.println("Enter a number (or -1 to quit): ");
        int input = scanner.nextInt();

        while (input != -1) {
            if (input > 0) {
                positiveCount++;
            } else if (input < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.println("Enter a number (or -1 to quit): ");
            input = scanner.nextInt();
        }

        System.out.println("Positive numbers count: " + positiveCount);
        System.out.println("Negative numbers count: " + negativeCount);
        System.out.println("Zero count: " + zeroCount);
    }
}

