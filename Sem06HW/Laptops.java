/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.

-Создать множество ноутбуков.
-Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, 
отвечающие фильтру. Критерии фильтрации можно хранить в Map.
Например:
Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
-Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
-Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
*/

import java.util.Objects;

public class Laptops {
    String name;
    int ramSize;
    int hardDiskCapacity;
    String operatingSystem;
    String color;

    public Laptops(String name, int ramSize, int hardDiskCapacity, String operatingSystem, String color){
        this.name = name;
        this.ramSize = ramSize;
        this.hardDiskCapacity = hardDiskCapacity;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getHardDiskCapacity() {
        return hardDiskCapacity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void setHardDiskCapacity(int hardDiskCapacity) {
        this.hardDiskCapacity = hardDiskCapacity;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String result = "Name: " + name + System.lineSeparator()
        + "RAM size: " + ramSize + System.lineSeparator()
        + "HD capacity: " + hardDiskCapacity + System.lineSeparator()
        + "OS: " + operatingSystem + System.lineSeparator() + "Color: " + color;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Laptops laptops = (Laptops) obj;

        return name.equals(laptops.name) && ramSize == laptops.ramSize && hardDiskCapacity == laptops.hardDiskCapacity && operatingSystem.equals(laptops.operatingSystem) && color.equals(laptops.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ramSize, hardDiskCapacity, operatingSystem, color);
    }

}
