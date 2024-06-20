 import java.util.Scanner;

public class SumReaderAndBreaker               {
    public static void main(String[] args)     {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a Target Integer number: ");
    int targetSum = scanner.nextInt();

    int currentSum = 0;
    while (true)                               {
    System.out.print("Enter an integer: ");
    int nextInt = scanner.nextInt();

    currentSum += nextInt;
    if (currentSum >= targetSum)               {
    break;
    }
    }

    System.out.println("Sum reached or exceeded: " + currentSum);
    }
    }

