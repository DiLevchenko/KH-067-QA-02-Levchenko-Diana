import java.util.Scanner;

public class CalculatorDL {
    static void executeCalculation(double num1, double num2, char operator) {
        double result;
        final char ADD = '+';
        final char SUB = '-';
        final char MUL = '*';
        final char DIV = '/';
        final char MOD = '%';

        switch (operator) {
            case ADD:
                result = num1 + num2;
                System.out.printf("%.2f %c %.2f = %.2f%n", num1, ADD, num2, result);
                break;
            case SUB:
                result = num1 - num2;
                System.out.printf("%.2f %c %.2f = %.2f%n", num1, SUB, num2, result);
                break;
            case MUL:
                result = num1 * num2;
                System.out.printf("%.2f %c %.2f = %.2f%n", num1, MUL, num2, result);
                break;
            case DIV:
                result = num1 / num2;
                System.out.printf("%.2f %c %.2f = %.2f%n", num1, DIV, num2, result);
                break;
            case MOD:
                result = num1 % num2;
                System.out.printf("%.2f %c %.2f = %.2f%n", num1, MOD, num2, result);
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
                e.printStackTrace(System.out);
                System.out.println("Incorrect input value(number required).");
                break;
            }
        } while (input.next().charAt(0) != 'c');
        input.close();
    }
}