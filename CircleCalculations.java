import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the radius of the circle: ");
    int radius = scanner.nextInt();

    System.out.printf("Diameter: %d%n", 2 * radius);
    System.out.printf("Circumference: %.2f%n", 2 * 3.14159 * radius);
    System.out.printf("Area: %.2f%n", 3.14159 * radius * radius);
    }
    }
