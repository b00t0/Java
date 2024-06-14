// В методе calculate класса Calculator реализовать калькулятор, который будет выполнять математические операции (+, -, *, /) 
// над двумя целыми числами и возвращать результат вещественного типа.

// В классе Printer необходимо реализовать проверку переданного оператора, при некорректном операторе программа должна вывести 

import java.util.Scanner;

public class HW1Task3 {
    public static void main(String[] args) {
        
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = inputScanner.nextInt();

        System.out.println("Enter the operator: ");
        int op = inputScanner.next().charAt(0);

        System.out.println("Enter the second number: ");
        int b = inputScanner.nextInt();

        double result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }
        System.out.println(result);
    }
}
