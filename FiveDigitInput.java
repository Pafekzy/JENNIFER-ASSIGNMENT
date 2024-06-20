import java.util.Scanner;

public class FiveDigitInput {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

         while (true) {
         System.out.println("Enter a 5-digit number: ");
         num = scanner.nextInt();

         if (num >= 10000 && num <= 99999) {
         break;
         } 
         else {
         System.out.println("Invalid input! Please enter a 5-digit number.");
         }
         }

         System.out.println("You entered: " + num);
         }
         }


