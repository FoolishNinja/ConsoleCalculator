package ch.bbw;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for class Calculator
 * @author Carlo Schmid
 * @version 17.01.2020
 */
public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testSumIsPositive() {
        System.out.println("[INFO]\n[INFO] Asserting that 10 + 25 is equal to 35\n[INFO]");
        assertTrue(calculator.sum(10, 25) == 35);
    }

    public void testSubtractIsPositive() {
        System.out.println("[INFO]\n[INFO] Asserting that 25 - 10 is equal to 15\n[INFO]");
        assertTrue(calculator.subtract(25, 10) == 15);
    }
}
