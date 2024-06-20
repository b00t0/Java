/*
Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел, 
реализует алгоритм сортировки слиянием.
 Метод должен возвращать отсортированный массив.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HW3Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> randomList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of random numbers");
        int n = scanner.nextInt();
        System.out.println("Enter the min of random numbers");
        int min = scanner.nextInt();
        System.out.println("Enter the max of random numbers");
        int max = scanner.nextInt();

        getRandomList(randomList, n, min, max);
        System.out.println(randomList);

        int[] array = listToArray(randomList);

        mergeSort(array);
        System.out.println(Arrays.toString(array));
        // printArray(array);

        // int[] a = {5, 1, 6, 2, 3, 4};
        // mergeSort(a);


    }

    private static void getRandomList(ArrayList<Integer> randomList, int n, int min, int max) {
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            randomList.add(rnd.nextInt(min, max));
        }
    }

    public static void mergeSort(int[] a) {
        if (a.length > 1) {
            // Разделяем массив пополам
            int mid = a.length / 2;
            int[] left = new int[mid];
            int[] right = new int[a.length - mid];
            
            // Копируем данные в левые и правые подмассивы
            System.arraycopy(a, 0, left, 0, mid);
            System.arraycopy(a, mid, right, 0, a.length - mid);

            // Рекурсивно сортируем каждый подмассив
            mergeSort(left);
            mergeSort(right);

            // Сливаем отсортированные подмассивы
            merge(a, left, right);
        }
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int mergeIndex = 0;

        // Сливаем элементы подмассивов в основной массив
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] <= right[rightIndex]) {
                array[mergeIndex++] = left[leftIndex++];
            } else {
                array[mergeIndex++] = right[rightIndex++];
            }
        }

        // Копируем оставшиеся элементы левого подмассива, если они есть
        while (leftIndex < left.length) {
            array[mergeIndex++] = left[leftIndex++];
        }

        // Копируем оставшиеся элементы правого подмассива, если они есть
        while (rightIndex < right.length) {
            array[mergeIndex++] = right[rightIndex++];
        }
    }

    public static int[] listToArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
