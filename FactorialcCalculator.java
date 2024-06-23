

import java.util.Scanner;

public class FactorialCalculatorAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1: Calculate factorial");
        System.out.println("2: Estimate e");
        System.out.println("3: Calculate ex");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter a number:");
                int n = scanner.nextInt();
                long factorial = calculateFactorial(n);
                System.out.println("Factorial: " + factorial);
                break;
            case 2:
                System.out.println("Enter number of terms:");
                int terms = scanner.nextInt();
                double sum = estimateE(terms);
                System.out.println("Estimated e: " + sum);
                break;
            case 3:
                System.out.println("Enter value of x:");
                double x = scanner.nextDouble();
                System.out.println("Enter number of terms:");
                terms = scanner.nextInt();
                sum = calculateEx(x, terms);
                System.out.println("Calculated ex: " + sum);
                break;
            default:
                System.out.println("Invalid option");
    }
    }

    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
    }
        return factorial;
    }

    public static double estimateE(int terms) {
        double sum = 0;
        for (int i = 0; i <= terms; i++) {
            sum += 1.0 / calculateFactorial(i);
    }
        return sum;
    }

    public static double calculateEx(double x, int terms) {
        double sum = 0;
        for (int i = 0; i <= terms; i++) {
            sum += Math.pow(x, i) / calculateFactorial(i);
    }
        return sum;
    }
    }

