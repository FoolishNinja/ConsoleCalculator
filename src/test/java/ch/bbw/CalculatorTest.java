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
    public void testSumTwoPositive() {
        System.out.println("[INFO]\n[INFO] Asserting that 10 + 25 is equal to 35\n[INFO]");
        assertTrue(calculator.sum(10, 25) == 35);
    }

    @Test
    public void testSumPositiveAndNegative() {
        System.out.println("[INFO]\n[INFO] Asserting that 10 + -25 is equal to -15\n[INFO]");
        assertTrue(calculator.sum(10, -25) == -15);
    }

    @Test
    public void testSubtractTwoPositive() {
        System.out.println("[INFO]\n[INFO] Asserting that 25 - 10 is equal to 15\n[INFO]");
        assertTrue(calculator.subtract(25, 10) == 15);
    }

    @Test
    public void testSubtractTwoPositiveBelowZero() {
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

    @Test
    public void protectedTestSumTwoPositive() {
        System.out.println("[INFO]\n[INFO]Asserting that 10 + 25 is equal to 35 and the protected method is accessible\n[INFO]");
        assertTrue(calculator.protectedSum(10,25) == 35);
    }

    /**
     * Testing private methods may be an indication that those methods should be moved into another class to promote reusability.
     * There are some ways to test the anyways tough:
     * - PrivilegedAccessor
     * - Dp4j
     * These are both jar packages that allow you to test private methods.
     */
}
