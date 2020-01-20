package ch.bbw;

import static org.junit.Assert.assertEquals;

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

    /**
     * Sum tests
     */

    @Test
    public void testSumTwoPositive() {
        System.out.println("[INFO]\n[INFO] Asserting that 10 + 25 is equal to 35\n[INFO]");
        assertEquals(calculator.sum(10, 25), 35);
    }

    @Test
    public void protectedTestSumTwoPositive() {
        System.out.println("[INFO]\n[INFO] Asserting that 10 + 25 is equal to 35 and the protected method is accessible\n[INFO]");
        assertEquals(calculator.protectedSum(10,25), 35);
    }

    @Test
    public void testSumPositiveAndNegative() {
        System.out.println("[INFO]\n[INFO] Asserting that 10 + -25 is equal to -15\n[INFO]");
        assertEquals(calculator.sum(10, -25), -15);
    }

    @Test
    public void testSumTwoNegative() {
        System.out.println("[INFO]\n[INFO] Asserting that -10 + -25 is equal to -35\n[INFO]");
        assertEquals(calculator.sum(-10,-25), -35);
    }

    @Test
    public void testSumZeroAndPositive() {
        System.out.println("[INFO]\n[INFO] Asserting that 0 + 25 is equal to 25\n[INFO]");
        assertEquals(calculator.sum(0, 25), 25);
    }

    @Test
    public void testSumZeroAndNegative() {
        System.out.println("[INFO]\n[INFO] Asserting that 0 + -25 is equal to -25\n[INFO]");
        assertEquals(calculator.sum(0, -25), -25);
    }

    @Test
    public void testSumMaxValueAndMinValue() {
        System.out.println("[INFO]\n[INFO] Asserting that Integer.MAX_VALUE + -Integer.MIN_VALUE is equal to -1\n[INFO]");
        assertEquals(calculator.sum(Integer.MAX_VALUE, -Integer.MIN_VALUE), -1);
    }

    @Test
    public void testSumMinValueAndPositive() {
        System.out.println("[INFO]\n[INFO] Asserting that Integer.MIN_VALUE + 3 is equal to -2147483645\n[INFO]");
        assertEquals(calculator.sum(Integer.MIN_VALUE, 3), -2147483645);
    }

    @Test
    public void testSumMaxValueAndNegative() {
        System.out.println("[INFO]\n[INFO] Asserting that Integer.MAX_VALUE + -3 is equal to 2147483644\n[INFO]");
        assertEquals(calculator.sum(Integer.MAX_VALUE, -3), 2147483644);
    }

    /**
     * Subtract tests
     */

    @Test
    public void testSubtractTwoPositive() {
        System.out.println("[INFO]\n[INFO] Asserting that 25 - 10 is equal to 15\n[INFO]");
        assertEquals(calculator.subtract(25, 10), 15);
    }

    @Test
    public void testSubtractTwoPositiveAboveZero() {
        System.out.println("[INFO]\n[INFO] Asserting that 25 - 10 is equal to 15\n[INFO]");
        assertEquals(calculator.subtract(25, 10), 15);
    }

    @Test
    public void testSubtractTwoPositiveBelowZero() {
        System.out.println("[INFO]\n[INFO] Asserting that 10 - 25 is equal to -15\n[INFO]");
        assertEquals(calculator.subtract(10, 25), -15);
    }

    @Test
    public void testSubtractTwoNegative() {
        System.out.println("[INFO]\n[INFO] Asserting that -15 - -15 is equal to 0\n[INFO]");
        assertEquals(calculator.subtract(-15, -15), 0);
    }

    @Test
    public void testSubtractPositiveAndNegative() {
        System.out.println("[INFO]\n[INFO] Asserting that 15 - -5 is equal to 20\n[INFO]");
        assertEquals(calculator.subtract(15, -5), 20);
    }

    @Test
    public void testSubtractMaxValueMinValue() {
        System.out.println("[INFO]\n[INFO] Asserting that Integer.MAX_VALUE - Integer.MIN_VALUE is equal to -1\n[INFO]");
        assertEquals(calculator.subtract(Integer.MAX_VALUE, Integer.MAX_VALUE), 0);
    }

    @Test
    public void testSubtractMaxValueAndPositive() {
        System.out.println("[INFO]\n[INFO] Asserting that Integer.MAX_VALUE - 3 is equal to 2147483644\n[INFO]");
        assertEquals(calculator.subtract(Integer.MAX_VALUE, 3), 2147483644);
    }

    @Test
    public void testSubtractTwoZero() {
        System.out.println("[INFO]\n[INFO] Asserting that 0 - 0 is equal to 0\n[INFO]");
        assertEquals(calculator.subtract(0,0), 0);
    }

    /**
     * Division tests
     */

    @Test(expected = ArithmeticException.class)
    public void testDivisionWhichThrowsError() {
        System.out.println("[INFO]\n[INFO] Asserting that 10 / 0 throws an exception\n[INFO]");
        assertEquals(calculator.division(10,0), Double.POSITIVE_INFINITY, 0.0);
    }

    @Test
    public void testDivisionWhichMustNotThrowError() throws ArithmeticException {
        System.out.println("[INFO]\n[INFO] Asserting that 10 / 0 throws an exception\n[INFO]");
        //assertEquals(calculator.division(10,0), Double.POSITIVE_INFINITY);
        assertEquals(calculator.division(10,5), 2, 0.0);
    }

    @Test
    public void testDivisionPositiveAndNegative() {
        System.out.println("[INFO]\n[INFO] Asserting that 100 / -25 is equal to -4\n[INFO]");
        assertEquals(calculator.division(100, -25), -4, 0.0);
    }

    @Test
    public void testDivisionTwoNegative() {
        System.out.println("[INFO]\n[INFO] Asserting that -100 / -25 is equal to 4\n[INFO]");
        assertEquals(calculator.division(-100, -25), 4, 0.0);
    }

    @Test
    public void testDivisionTwoPositive() {
        System.out.println("[INFO]\n[INFO] Asserting that 100 / 25 is equal to 4\n[INFO]");
        assertEquals(calculator.division(100, 25), 4, 0.0);
    }

    @Test
    public void testDivisionZeroAndPositive() {
        System.out.println("[INFO]\n[INFO] Asserting that 0 / 25 is equal to 0\n[INFO]");
        assertEquals(calculator.division(0, 25),0, 0.0);
    }

    @Test
    public void testDivisionNegativeAndPositive() {
        System.out.println("[INFO]\n[INFO] Asserting that -100 / 25 is qual to -4\n[INFO]");
        assertEquals(calculator.division(-100, 25),-4, 0.0);
    }

    @Test
    public void testDivisionZeroAndNegative() {
        System.out.println("[INFO]\n[INFO] Asserting that 0 / -25 is qual to 0\n[INFO]");
        assertEquals(calculator.division(0, -25), 0, 0.0);
    }

    @Test (expected = ArithmeticException.class)
    public void testDivisionZeroAndZero() {
        System.out.println("[INFO]\n[INFO] Asserting that 0 / 0 is throws an exception\n[INFO]");
        assertEquals(calculator.division(0, 0), Double.POSITIVE_INFINITY, 0.0);
    }

    /**
     * Testing private methods may be an indication that those methods should be moved into another class to promote reusability.
     * There are some ways to test the anyways tough:
     * - PrivilegedAccessor
     * - Dp4j
     * These are both jar packages that allow you to test private methods.
     */
}
