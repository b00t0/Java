/*
Задание No1
📌 Заполнить список десятью случайными числами.
📌 Отсортировать список методом sort() и вывести его на экран.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Task01 {
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
        Collections.sort(randomList);
        System.out.println(randomList);
    }

    private static void getRandomList(ArrayList<Integer> randomList, int n, int min, int max) {
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            randomList.add(rnd.nextInt(min, max));
        }
    }
}
