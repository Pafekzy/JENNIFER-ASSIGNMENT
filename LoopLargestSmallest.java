


import java.util.Scanner;

public class LoopLargestSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (or enter 'stop' to finish):");
        Double largest = null;
        Double smallest = null;
        while (true) {
            if (scanner.hasNext("stop")) {
                scanner.next();
                break;
            } else if (scanner.hasNextDouble()) {
                double num = scanner.nextDouble();
                if (largest == null || num > largest) {
                    largest = num;
                }
                if (smallest == null || num < smallest) {
                    smallest = num;
                }
            } else {
                scanner.next();
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}


 