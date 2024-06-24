/*
Дан LinkedList с несколькими элементами разного типа. В методе revert класса 
LLTasks реализуйте разворот этого списка без использования встроенного функционала.
*/

import java.util.LinkedList;

public class HW4Task1 {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add(1);
        list.add("One");
        list.add(2);
        list.add("Two");
        list.add(3);
        list.add("Three");
        System.out.println(list);
        LinkedList<Object> reversedList = revert(list);
        System.out.println(reversedList);

        
    }

    public static LinkedList<Object> revert(LinkedList<Object> list) {
        LinkedList<Object> reversedList = new LinkedList<Object>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}
