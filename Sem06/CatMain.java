/*
Задание No3
1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, 
можно использовать не все придуманные поля и методы. Создайте несколько экземпляров этого класса, 
выведите их в консоль.
2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и возраст 
(или другие параметры на ваше усмотрение).


Задание No4
1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. 
Поместите в него некоторое количество объектов.
2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. 
Убедитесь, что все они сохранились во множество.
3. Создайте метод public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true,
только если значения во всех полях сравниваемых объектов равны.
4. Создайте метод public int hashCode()
который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.

*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CatMain {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vasiliy", 2018, "black", "Ivanov");
        Cat cat2 = new Cat("Seryashka", 2020, "gray", "Petrov");
        Cat cat3 = new Cat("Galife", 2022, "white", "Sidorov");
        Cat cat4 = new Cat("Seryashka", 2020, "gray", "Petrov");
        Cat cat5 = new Cat("Galife", 2022, "white", "Sidorov");

        // System.out.println(cat1 + System.lineSeparator());
        // System.out.println(cat2 + System.lineSeparator());
        // System.out.println(cat3 + System.lineSeparator());

        Set<Cat> cats = new HashSet<>(Arrays.asList(cat1, cat2, cat3, cat4, cat5));

        for (Cat cat : cats) {
            System.out.println(cat);
            System.out.println();
        }

    }
}
