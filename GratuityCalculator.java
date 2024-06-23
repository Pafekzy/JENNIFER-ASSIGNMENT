import java.util.Scanner;

public class GratuityCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter subtotal: ");
    double subtotal = scanner.nextDouble();

    System.out.print("Enter gratuity rate (in %): ");
    double gratuityRate = scanner.nextDouble();

    double gratuity = subtotal * (gratuityRate / 100);
    double total = subtotal + gratuity;

    System.out.printf("Gratuity: $%.2f\n", gratuity);
    System.out.printf("Total: $%.2f\n", total);
  }
}

