package ch.bbw;

/**
 * @author Carlo Schmid
 * @version 17.01.2020
 */
public class App 
{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum1 = 10;
        int sum2 = 20;

        System.out.println("Console Calculator\n==================\n\nSumme " + sum1 + " + " + sum2 + " = " + calculator.sum(sum1,sum2));
    }
}
