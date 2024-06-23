public class TableCast  {
    public static void main(String[] args) {
        System.out.println("a | b | pow(a, b)");
        for (int num1 = 1; num1 <= 5; num1++) {
            int a = num1 ;
             int b = num1 + 1;
              int pow = 1;
        for (int num2= 0; num2 < b; num2++) {
                pow *= a;
     }
            System.out.printf("%d | %d | %d%n", a, b, pow);
     }
     }
     }
