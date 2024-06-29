/*
Задание No0
📌 Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов 321456 Васильев 234561 Петрова 234432 Иванов 654321 Петрова 345678 Иванов
📌 Вывести данные по сотрудникам с фамилией Иванов.
*/

import java.util.HashMap;
import java.util.Map;

public class Task00 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); // LinkedHashMap - order of addition, TreeMap - sorting A-Z
        hashMap.put(123456, "Ivanov");
        hashMap.put(321456, "Vasiliev");
        hashMap.put(234561, "Petrova");
        hashMap.put(234432, "Ivanov");
        hashMap.put(654321, "Petrova");
        hashMap.put(345678, "Ivanov");

        String targetName = "Ivanov";

        for (int passportNumber : hashMap.keySet()) {
            String name = hashMap.get(passportNumber);
            if (name.equals(targetName)) {
                System.out.println("Passport number: " + passportNumber + ", Surname: " + name);
            }
        }

    }
}
