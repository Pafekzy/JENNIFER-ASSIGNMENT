 
import java.util.Scanner;

public class BMICalculator                      {
 public static void main(String[] args)         {
 Scanner scanner = new Scanner(System.in);

 System.out.print("Enter weight (in pounds): ");
 int weight = scanner.nextInt();

 System.out.print("Enter height (in inches): ");
 int height = scanner.nextInt();

 int bmi = calculateBMI(weight, height);

 System.out.println("Your BMI is: " + bmi);


  String category = getBMICategory(bmi);         {
 if (bmi <66.1)                                  {
 return "Very severely underweight (<66.1)";
 } 
 else if (bmi < 70.4)                            {
 return "Severely underweight (66.1-70.3)";
 } 
 else if (bmi < 80.8)                            {
 return "Underweight (70.4-80.7)";
 }
 else if (bmi < 109)                             {
 return "Normal weight (80.8-108.9)";
 }
 else if (bmi < 131.2)                           {
 return "Overweight (109-131.1)";
 }
 else if (bmi < 152.2)				 {
 return "Obese (131.2-152.2)";
 }
 else if (bmi < 173.4) 				 {
 return "Severely obese (152.2-173.3)";
 }
 else                                            {
 return "Very severely obese (≥173.4)";
 }
 }
 }
 }

