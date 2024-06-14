// Задание No1
// 📌 Написать программу, которая запросит пользователя ввести <Имя> в консоли.
// 📌 Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        System.out.println("Enter the name: ");
        Scanner inputScanner = new Scanner(System.in,"ibm866");
        String name = inputScanner.nextLine();
        System.out.printf("Hello, %s", name);
        inputScanner.close(); 
    }   
}
