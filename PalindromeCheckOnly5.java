import java.util.Scanner;

public class PalindromeCheckOnly5                  {
	public static void main(String[] args)     {
	Scanner scanner = new Scanner(System.in);
	//int num = scanner.nextInt();

	while (true) {
        System.out.println("Enter a 5-digit number: ");
        int num = scanner.nextInt();

        if (num >= 10000 && num <= 99999)          {
        break;
        }
        else                                       {
        System.out.println("Invalid input! Please enter a 5-digit number.");
        }
        }

        int originalNum = num;
        int reversedNum = 0;

        while (num != 0)                           {
        int digit = num % 10;
        reversedNum = reversedNum * 10 + digit;
        num /= 10;
        }

        if (originalNum == reversedNum)            {
        System.out.println("The number is a palindrome.");
        }   

        else {
        System.out.println("The number is not a palindrome.");
        }
        }
        }





