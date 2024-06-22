package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import ec.edu.ups.calculator.ICalculator;

public class ICalculatorTest {

    @Test
    public void give_two_integer_when_addition_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.addition(2, 3)).thenReturn(5);
        assertEquals(5, c.addition(2, 3));
    }
    @Test
    public void give_two_integers_when_subtraction_then_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.substraction(5, 3)).thenReturn(2);
        assertEquals(2, c.addition(5, 3));
    }
    @Test(expected = ArithmeticException.class)
    public void give_two_integers_when_division_then_exception() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.division(6, 0)).thenReturn(3);
        assertEquals(3, c.addition(6, 0));
    }

    
    @Test(timeout = 150)
    public void give_two_integers_when_multiplication_then_timeout() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.multiplication(2, 3)).thenReturn(6);
        assertEquals(6, c.addition(2, 3));
    }


   

}
