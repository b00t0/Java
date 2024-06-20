/*
Задание No3
📌 Создать список типа ArrayList<String>.
📌 Поместить в него как строки, так и целые числа.
📌 Пройти по списку, найти и удалить целые числа.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Iterator;

public class Task03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("One", "Two", "Three", "1", "2", "Hello", "-10", "Java"));
        // deleteInt(list);
        deleteIntIter(list);
        System.out.println(list);
    }
    private static boolean isInt(String str) {
        try {
            Integer.parseInt(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    private static void deleteInt(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (isInt(list.get(i))) {
                list.remove(i);
                i--;
            }
        }
        
    }

    // using iterator
    private static void deleteIntIter(List<String> list) {
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String elem = iter.next();
            if (isInt(elem)) {
                iter.remove();
            }
        }
    }
}
