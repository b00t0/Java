/*
Задание No0
📌 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
📌 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
*/

import java.util.ArrayList;
import java.util.LinkedList;

public class Task00 {
    public static void main(String[] args) {
        int size = 10_000;

        System.out.println("AddLast");

        System.out.println("ArrayList");
        long start = System.currentTimeMillis();
        getArrayListAddLast(size);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("LinkedList");
        start = System.currentTimeMillis();
        getLinkedListAddLast(size);
        System.out.println(System.currentTimeMillis() - start);


        System.out.println("AddFirst");

        System.out.println("ArrayList");
        start = System.currentTimeMillis();
        getArrayListAddFirst(size);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("LinkedList");
        start = System.currentTimeMillis();
        getLinkedListAddFirst(size);
        System.out.println(System.currentTimeMillis() - start);


        System.out.println("AddMiddle");

        System.out.println("ArrayList");
        start = System.currentTimeMillis();
        getArrayListAddMiddle(size);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("LinkedList");
        start = System.currentTimeMillis();
        getLinkedListAddMiddle(size);
        System.out.println(System.currentTimeMillis() - start);

    }

    public static ArrayList<Integer> getArrayListAddLast(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.addLast(i);
        }
        return arrayList;
    }

    public static LinkedList<Integer> getLinkedListAddLast(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.addLast(i);
        }
        return linkedList;
    }

    public static ArrayList<Integer> getArrayListAddFirst(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.addFirst(i);;
        }
        return arrayList;
    }

    public static LinkedList<Integer> getLinkedListAddFirst(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.addFirst(i);
        }
        return linkedList;
    }

    public static ArrayList<Integer> getArrayListAddMiddle(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList.size()/2, i);
        }
        return arrayList;
    }

    public static LinkedList<Integer> getLinkedListAddMiddle(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.add(linkedList.size()/2, i);
        }
        return linkedList;
    }

}
