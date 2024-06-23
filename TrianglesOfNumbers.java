

public class TrianglesOfNumbers {
    public static void main(String[] args) {
        System.out.println("Category A");
        printTriangleA(6);
        System.out.println("\nCategory B");
        printTriangleB(6);
        System.out.println("\nCategory C");
        printTriangleC(6);
        System.out.println("\nCategory D");
        printTriangleD(6);
    }

    private static void printTriangleA(int n) {
        for (int num1 = 1; num1 <= n; num1++) {
            for (int j = 1; j <= num1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void printTriangleB(int n) {
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void printTriangleC(int n) {
       for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 9 - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void printTriangleD(int n) {
        int count = 1;

       for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}

