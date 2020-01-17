package ch.bbw;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class for class Calculator
 * @author Carlo Schmid
 * @version 17.01.2020
 */
public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void testSumIsPositive() {
        System.out.println("[INFO]\n[INFO] Asserting that 10 + 25 is equal to 35\n[INFO]");
        assertTrue(calculator.sum(10, 25) == 35);
    }

    @Test
    public void testSumIsNegative() {
        System.out.println("[INFO]\n[INFO] Asserting that 10 + -25 is equal to -15\n[INFO]");
        assertTrue(calculator.sum(10, -25) == -15);
    }

    @Test
    public void testSubtractIsPositive() {
        System.out.println("[INFO]\n[INFO] Asserting that 25 - 10 is equal to 15\n[INFO]");
        assertTrue(calculator.subtract(25, 10) == 15);
    }

    @Test
    public void testSubtractIsNegative() {
        System.out.println("[INFO]\n[INFO] Asserting that 10 - 25 is equal to -15\n[INFO]");
        assertTrue(calculator.subtract(10, 25) == -15);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionWhichThrowsError() {
        System.out.println("[INFO]\n[INFO] Asserting that 10 / 0 throws an exception\n[INFO]");
        assertTrue(calculator.division(10,0) == Double.POSITIVE_INFINITY);
    }

    @Test
    public void testDivisionWhichMustNotThrowError() throws ArithmeticException {
        System.out.println("[INFO]\n[INFO] Asserting that 10 / 0 throws an exception\n[INFO]");
        //assertTrue(calculator.division(10,0) == Double.POSITIVE_INFINITY);
        assertTrue(calculator.division(10,5) == 2);
    }
}
