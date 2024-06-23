import java.util.Scanner;

public class FactorialCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number:");
    int n = scanner.nextInt();

    long factorial = 1;
    for (int iterated  = 1; iterated  <= n; iterated ++) {
      factorial *= iterated ;
    }

    System.out.println("Factorial: " + factorial);
  }
  }
