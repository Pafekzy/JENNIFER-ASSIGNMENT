import java.util.Scanner;

public class PalindromeCheck5Only             {
       public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int num;
       while (true)                           {
       System.out.println("Enter a 5-digit number: ");
       num = scanner.nextInt();
       if (num >= 10000 && num <= 99999)      {
       break;
       }
       else                                   {
       System.out.println("Invalid input! Please enter a 5-digit number.");
       }
       }

       int originalNum = num;
       int reversedNum = 0;
       while (num != 0)                     {

       int digit = num % 10;
       reversedNum = reversedNum * 10 + digit;
       num /= 10;
       }

       if (originalNum == reversedNum)      {
       System.out.println("The number is a palindrome.");
       }
       else {
       System.out.println("The number is not a palindrome.");
       }
       scanner.close();  
       }
       }






















