import java.util.Scanner;

public class Calculator_DL {
    public static void main(String[] args) {
        char operator;
        double num1, num2, result;
        Scanner input = new Scanner(System.in);

        System.out.println("Please, choose an operator: +, -, *, or /");
            operator = input.next().charAt(0);
        System.out.println("Please, enter first number");
            num1 = input.nextDouble();
        System.out.println("Please, enter second number");
            num2 = input.nextDouble();

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
            default:
                System.out.println("Invalid operator!");
                    break;
        }
        input.close();
    }
}


