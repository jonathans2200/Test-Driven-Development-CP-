package calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ec.edu.ups.calculator.Calculator;

public class CalculatorTest {

    Calculator c = null;
    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass()");
    }
    @Before
    public void setUp() {
        c = new Calculator();
        System.out.println("setUp()");
    }

  

    @Test
    public void given_two_integers_when_addition_then_ok() {
        Calculator c = new Calculator(); 
        int expected = 6;
        int actual = c.addition(4, 2);
        System.out.println("Test 1");
        assertEquals(expected, actual);

    }
    @Test
    public void give_two_integers_when_subtraction_then_ok() {
        Calculator c = new Calculator();
        assertEquals(2, c.substraction(4, 2));
        System.out.println("Test 2");
    }

    @Test(expected = ArithmeticException.class)
    public void give_two_integers_when_division_then_exception() {
        assertEquals(3, c.division(6, 0));
        System.out.println("Test 3");
    }

    @Test(timeout = 150)
    public void give_two_integers_when_multiplication_then_timeout() {
        assertEquals(20, c.multiplication(5, 4));
        System.out.println("Test 4");
    }

    @After
    public void tearDown() {
        System.out.println("tearDown()");
        c.setAns(0);
    }
}