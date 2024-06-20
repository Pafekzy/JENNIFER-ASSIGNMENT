import java.util.Scanner;

public class Palindrome                    {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int reversed = 0;
        int original = num;

        while (num != 0)                   {
            int pop = num % 10;
            reversed = reversed * 10 + pop;
            num /= 10;
        }

        if (original == reversed)           {
            System.out.println(original + " is a palindrome.");
        } 
         else                               {
            System.out.println(original + " is not a palindrome.");
        }
        }
        }
