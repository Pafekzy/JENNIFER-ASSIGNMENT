import java.util.Scanner;

public class FactorialbCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter number of terms:");
    int terms = scanner.nextInt();

    double sum = 0;
    for (int i = 0; i <= terms; i++) {
      long factorial = 1;
      for (int j = 1; j <= i; j++) {
        factorial *= j;
      }
      sum += 1.0 / factorial;
    }

    System.out.println("Estimated e: " + sum);
  }
}
