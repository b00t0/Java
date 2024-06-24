/*
Задание No2
Реализовать консольное приложение, которое:
1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная
была первой в списке, а первая - последней.
3. Если введено revert, удаляет предыдущую введенную строку из памяти.
*/

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        while (true) {
            System.out.println("Please input some text");
            System.out.println("Input print for output the reverse list");
            System.out.println("Input revert for deleting the previous text");
            System.out.println("Input 'q' for exit");
            
            String input = scanner.nextLine();
            
            if (input.equals("q")) {
                System.out.println("Bye");
                break;
            }

            if (input.equals("print")) {
                if (list.isEmpty()) {
                    System.out.println("The list is empty");
                } else {
                    for (int i = list.size()-1; i >= 0; i--) {
                        System.out.print(list.get(i) + " ");
                    }
                    System.out.println();
                }
            } else if (input.equals("revert")) {
                list.removeLast();
                System.out.println(list);
            } else {
                list.add(input);
                System.out.println(list);
            }

        }
        scanner.close();
    }
}
