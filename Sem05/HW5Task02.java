/*
Вы работаете с приложением для учета имен пользователей. Ваша задача - разработать программу, 
которая принимает на вход пять имен пользователей (или использует имена по умолчанию, если аргументы 
не предоставлены) и подсчитывает, сколько раз каждое имя встречается.
Программа должна использовать HashMap для хранения имен и их количества вхождений.
По завершении, программа выводит результат в виде пар "имя - количество".
*/

import java.util.HashMap;

public class HW5Task02 {private static HashMap<String, Integer> names = new HashMap<>();

    public static void main(String[] args) {
        String name1 = "Elena";
        String name2 = "Elena";
        String name3 = "Elena";
        String name4 = "Ivan";
        String name5 = "Ivan";
        addName(name1);
        addName(name2);
        addName(name3);
        addName(name4);
        addName(name5);
        showNamesOccurrences();
    }

    public static void addName(String name) {
        int count = 1;
        if (names.containsKey(name)) {
            count = names.get(name);
            count++;
            names.put(name, count);
        } else {
            names.put(name, count);
        }
    }

    public static void showNamesOccurrences() {
        System.out.println(names);
    }
}
