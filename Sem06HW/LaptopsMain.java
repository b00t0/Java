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

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LaptopsMain {
    public static void main(String[] args) {
        Laptops laptop1 = new Laptops("Lenovo", 32, 500,  "Windows", "black");
        Laptops laptop2 = new Laptops("HP", 16, 500,  "Windows", "silver");
        Laptops laptop3 = new Laptops("Macbook", 16, 250,  "MacOS", "silver");
        Laptops laptop4 = new Laptops("Sony", 8, 500,  "Windows", "white");
        Laptops laptop5 = new Laptops("Macbook Pro", 32, 1000,  "MacOS", "black");
        Laptops laptop6 = new Laptops("ASUS", 8, 250,  "Windows", "silver");
        Laptops laptop7 = new Laptops("Lenovo", 8, 250,  "Windows", "white");
        Laptops laptop8 = new Laptops("HP", 8, 250,  "Windows", "black");


        Set<Laptops> laptops = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6, laptop7, laptop8));
        
        // Print out all the laptops:
        // for (Laptops laptop : laptops) {
        //     System.out.println(laptop);
        //     System.out.println();
        // }

        Map<Integer, String> criterionListing = new HashMap<>();
        criterionListing.put(1, "RAM");
        criterionListing.put(2, "HDD");
        criterionListing.put(3, "OS");
        criterionListing.put(4, "Color");

        Scanner scanner = new Scanner(System.in);
     
        Map<String, String> filter = new HashMap<>();
        
        while (true) {
            try {
                if (!filter.isEmpty()) {
                    System.out.println("Selected criterion:");
                    for (Map.Entry<String, String> entry : filter.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                }
                System.out.println("Input the criterion number:");
                System.out.println("1 - RAM (8/16/32)");
                System.out.println("2 - HDD capacity (250/500)");
                System.out.println("3 - OS (Windows/MacOS)");
                System.out.println("4 - Color (Black/White/Silver)");

                int criterion = scanner.nextInt();
                if (criterionListing.containsKey(criterion)) {
                    String criterionKey = criterionListing.get(criterion);
                    System.out.println("Input the value for " + criterionKey + ":");
                    String value = scanner.next();
                    filter.put(criterionKey, value);
                }
                else {
                    System.out.println("Incorrect criterion. Please try again.");
                }

                System.out.println("Continue the criterion input? (Yes/No)");
                String continueInput = scanner.next();
                if (continueInput.equalsIgnoreCase("No")) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }
        scanner.close();


        Set<Laptops> filteredLaptops = filterLaptops(laptops, filter);
        if (filteredLaptops.isEmpty()) {
            System.out.println("No laptops are found for selected criterion.");
        } else {
            System.out.println("The following laptops are found for selected criterion:");
            for (Laptops laptop : filteredLaptops) {
                System.out.println();
                System.out.println(laptop);
                System.out.println();
            }
        }

    }
    public static Set<Laptops> filterLaptops(Set<Laptops> laptops, Map<String, String> filters) {
        Set<Laptops> filteredLaptops = new HashSet<>(laptops);

        // Применение каждого фильтра
        for (Map.Entry<String, String> filter : filters.entrySet()) {
            String key = filter.getKey();
            String value = filter.getValue();

            switch (key) {
                case "RAM":
                    int ram = Integer.parseInt(value);
                    filteredLaptops.removeIf(laptop -> laptop.ramSize != ram);
                    break;
                case "HDD":
                    int hdd = Integer.parseInt(value);
                    filteredLaptops.removeIf(laptop -> laptop.hardDiskCapacity != hdd);
                    break;
                case "OS":
                    filteredLaptops.removeIf(laptop -> !laptop.operatingSystem.equalsIgnoreCase(value));
                    break;
                case "Color":
                    filteredLaptops.removeIf(laptop -> !laptop.color.equalsIgnoreCase(value));
                    break;
            }
        }
        return filteredLaptops;
    }
    
}