/*
Реализуйте метод, который принимает на вход целочисленный массив arr:
- Создаёт список ArrayList, заполненный числами из исходого массива arr.
- Сортирует список по возрастанию и выводит на экран.
- Находит минимальное значение в списке и выводит на экран - Minimum is {число} - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
- Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:

Integer[] arr - массив целых чисел.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HW3Task3 {
    public static void main(String[] args) {
        int[] nums = new int[] { -2, -1, 0, 1, 2, 3, 4, 5 };
        analyzeNumbers(nums);
    }

    public static void analyzeNumbers(int[] arr) {
        List<Integer> list = new ArrayList<>(arr.length);
        double sum = 0;
        for (Integer elem : arr) {
            list.add(elem);
            sum += elem;
        }

        Collections.sort(list);
        int max = list.get(list.size() - 1);
        int min = list.get(0);
        double avg = sum / list.size();

        System.out.println(list);
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);
        System.out.println("Average is = " + avg);

    }
}
