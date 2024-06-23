 import java.util.Scanner;
 
 public class BarChartAstericks {
 public static void main (String[] args) {
 Scanner scanner = new Scanner(System.in);

System.out.println("Enter five numbers within the range of 1 to 30: ");
for (int num = 0; num < 5; num++){
int number = scanner.nextInt();
printBar(number); 
}
}

public static void printBar(int number){
for (int num = 0; num < number; num++){
System.out.print("*");
}
System.out.println();
}
}