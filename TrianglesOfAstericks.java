

public class TrianglesOfAstericks {
    public static void main(String[] args) {
        System.out.println("Category A");
        printTriangleA(10);
        System.out.println("\nCategory B");
        printTriangleB(10);
        System.out.println("\nCategory C");
        printTriangleC(10);
        System.out.println("\nCategory D");
        printTriangleD(10);
    }

    private static void printTriangleA(int n) {
        for (int num1 = 1; num1 <= n; num1++) {
            for (int j = 1; j <= num1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printTriangleB(int n) {
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printTriangleC(int n) {
       for (int i = 1; i <= 10; i++) {
            for (double j = 1; j <= 11 - i; ++j) {
                System.out.print("*");
            }
                 System.out.println();  
        }
    }

    private static void printTriangleD(int n) {
        int count = 1;

       for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

