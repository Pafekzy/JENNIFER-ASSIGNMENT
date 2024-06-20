 import java.util.Scanner;

public class PositiveNegativeZeroCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        while (true) {
            System.out.println("Enter a number (or 'q' to quit):");
            String input = scanner.next();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            int number = Integer.parseInt(input);

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Positive numbers count: " + positiveCount);
        System.out.println("Negative numbers count: " + negativeCount);
        System.out.println("Zero count: " + zeroCount);
    }
}
