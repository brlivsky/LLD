package Decorator;

/*
 * You are building a simple calculator class that supports basic operations like add, subtract, multiply, and divide. 
 * You need to enhance the calculator with the following functionality:
 *  Logging: Each time an operation is performed, log the operation name and its arguments.
 *  Modularity: Implement logging as a separate feature without modifying the core calculator code.
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculatorWithLog = new LoggedCalculator(new BasicCalculator());

        System.out.println(calculatorWithLog.add(10, 5));
        System.out.println(calculatorWithLog.subtract(10, 5));
        System.out.println(calculatorWithLog.multiply(10, 5));
        System.out.println(calculatorWithLog.divide(10, 5));
    
    }

}
