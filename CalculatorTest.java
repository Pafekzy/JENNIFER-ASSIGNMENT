import static  org.junit.jupiter.org.api.Assertions.assertEqual; 
import org.junit.jupiter.api.Test;
public class CalculatorTest {

 @Test
 

   public void testThatCalculatorCanAddTwoPositiveNumbers(){
}

   
  
 Calculate calculator = new Calculator();


int result = calculator.add(2,3);

assertEquals( 5 , result);

}

