/*
Дан произвольный массив целых чисел. Создайте список ArrayList, заполненный данными из этого массива. 
Необходимо удалить из списка четные числа и вернуть результирующий.

Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers 
принимает на вход один параметр: Integer[] arr - список целых чисел, возвращает список ArrayList<Integer>
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HW3Task2 {
    public static void main(String[] args) {
        // ArrayList<Integer> randomList = new ArrayList<>();
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the amount of random numbers");
        // int n = scanner.nextInt();
        // System.out.println("Enter the min of random numbers");
        // int min = scanner.nextInt();
        // System.out.println("Enter the max of random numbers");
        // int max = scanner.nextInt();

        // getRandomList(randomList, n, min, max);
        // System.out.println(randomList);

        // int[] array = listToArray(randomList);
        // Integer[] arr = convertToIntArray(array);

        Integer[] arrayNew = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        removeEvenNumbers(arrayNew);

    }

    private static void getRandomList(ArrayList<Integer> randomList, int n, int min, int max) {
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            randomList.add(rnd.nextInt(min, max));
        }
    }

    public static int[] listToArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public static void removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (Integer elem : arr) {
            if (elem % 2 != 0) {
                list.add(elem);
            }
        }
        System.out.println(list);
    }

    public static Integer[] convertToIntArray(int[] intArray) {
        Integer[] result = new Integer[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            result[i] = intArray[i];
        }
        return result;
    }
}
