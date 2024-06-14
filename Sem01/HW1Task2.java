// Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.

// Напишите свой код в методе printPrimeNums класса Answer.

import java.util.Scanner;

public class HW1Task2 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner inputScanner = new Scanner(System.in);
        int number = inputScanner.nextInt();

        for (int i = 2; i <= number; i++) {
            int count = 0;
            for (int j = 2; j < i && count < 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count < 2) {
                System.out.println(i);
            }
            
        }
    }
}
