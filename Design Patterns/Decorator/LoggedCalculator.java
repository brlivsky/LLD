package Decorator;

public class LoggedCalculator extends BasicCalculator {
    
    private final Calculator calculator;

    LoggedCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int a, int b) {
        System.out.println(a + " and " + b + " are added");
        return calculator.add(a, b);
    }

    @Override
    public int subtract(int a, int b) {
        System.out.println(a + " is subracted from " + b);
        return calculator.subtract(a, b);
    }

    @Override
    public int multiply(int a, int b) {
        System.out.println(a + " and " + b + " are multiplied");
        return calculator.multiply(a, b);
    }

    @Override
    public int divide(int a, int b) {
        System.out.println(a + " is divided by " + b);
        return calculator.divide(a, b);
    }
}
