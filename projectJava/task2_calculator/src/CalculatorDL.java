import java.util.Scanner;

public class CalculatorDL {
    static void executeCalculation(double num1, double num2, char operator) {
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            case '%':
                result = num1 % num2;
                System.out.println(num1 + " % " + num2 + " = " + result);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
    }

    public static void main(String[] args) {
        char operator;
        double num1, num2;
        boolean repeatLoop;
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
                repeatLoop = input.next().charAt(0) != 'c';
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Incorrect input value(number required).");
                break;
            }
        } while (repeatLoop);
        input.close();
    }
}


