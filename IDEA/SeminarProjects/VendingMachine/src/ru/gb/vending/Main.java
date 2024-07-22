package ru.gb.vending;

import ru.gb.vending.product.Bottle;
import ru.gb.vending.product.Product;
import ru.gb.vending.vending.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        Product product1 = new Product("Twix", 100);
        Product product2 = new Bottle("Coca-Cola", 120, 2);
        Product product3 = new Product("Lays", 150);

        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);

        System.out.println(vendingMachine);
    }
}