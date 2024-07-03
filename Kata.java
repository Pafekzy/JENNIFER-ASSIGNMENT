 
 

public class Kata {
    public static void main(String[] args) {
        
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) return true;
        else return false;
    }

    public static int subtract(int a, int b) {
        return Math.abs(a - b);
    }

    public static float divide(int a, int b) {
        if (b == 0) return 0;
        else return Math.round((float) a / b * 100) / 100;
    }

    public static int factorOf(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static boolean isSquare(int number) {
        int root = (int) Math.sqrt(number);
        return root * root == number;
    }

    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }

    public static long factorialOf(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}

 