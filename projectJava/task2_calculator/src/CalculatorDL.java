import java.util.Scanner;

public class CalculatorDL {
    static void executeCalculation(double num1, double num2, char operator) {
        double result;
        final char add = '+';
        final char sub = '-';
        final char mul = '*';
        final char div = '/';
        final char mod = '%';

        switch (operator) {
            case add:
                result = num1 + num2;
                System.out.printf("%.2f %c %.2f = %.2f%n", num1, add, num2, result);
                break;
            case sub:
                result = num1 - num2;
                System.out.printf("%.2f %c %.2f = %.2f%n", num1, sub, num2, result);
                break;
            case mul:
                result = num1 * num2;
                System.out.printf("%.2f %c %.2f = %.2f%n", num1, mul, num2, result);
                break;
            case div:
                result = num1 / num2;
                System.out.printf("%.2f %c %.2f = %.2f%n", num1, div, num2, result);
                break;
            case mod:
                result = num1 % num2;
                System.out.printf("%.2f %c %.2f = %.2f%n", num1, mod, num2, result);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
    }

    public static void main(String[] args) {
        char operator;
        double num1, num2;
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("Please, enter first number");
                num1 = input.nextDouble();
                System.out.println("Please, choose an operator: +, -, *, / or %");
                operator = input.next().charAt(0);
                System.out.println("Please, enter second number");
                num2 = input.nextDouble();

                executeCalculation(num1, num2, operator);

                System.out.println("To do new calculation enter anything but \'c\'.");
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Incorrect input value(number required).");
                break;
            }
        } while (input.next().charAt(0) != 'c');
        input.close();
    }
}


