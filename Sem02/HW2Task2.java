/*
Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:

int[] arr - числовой массив

После каждого прохода по массиву ваш код должен делать запись в лог-файл 'log.txt' в формате год-месяц-день 
час:минуты {массив на данной итерации}. 
Для логирования использовать логгер logger класса BubbleSort.
*/

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class HW2Task2 {
    public static void bubbleSort(int[] mas) {
        clearLog();
        int n = mas.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (mas[j] > mas[j + 1]) {
                    int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
            writeToLog(Arrays.toString(mas));
        }
        writeToLog(Arrays.toString(mas));
    }

    public static void writeToLog(String message) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String formattedDate = dateFormat.format(new Date());

        try (PrintWriter writer = new PrintWriter(new FileWriter("log.txt", true))) {
            writer.println(formattedDate + " " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 3, 4, 8, 2, 5, 7, 1, 6, 10 };
        System.out.println("Original array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        bubbleSort(arr);

        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void clearLog() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("log.txt", false))) {
            writer.print("");
        } catch (IOException e) {
            System.err.println("Failed to clear log file: " + e.getMessage());
        }
    }
}
