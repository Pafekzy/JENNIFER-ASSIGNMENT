

import java.util.Scanner;

public class IfGradeScoreApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score (0-100): ");
        int score = input.nextInt();

        
        if (score >= 80 && score <= 100) {
            System.out.print("grade  A");
        } 
           if (score >= 70 && score <= 79){
            System.out.print("grade  B");
        }  
          if (score >= 50 && score <= 69) {
            System.out.print("grade  C");
        }
           if (score < 50) {
            System.out.print("grade  D");
        }

       }
    }

 