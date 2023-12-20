package com.company;

import java.util.Scanner;

public final class Americano extends Coffee {
    public Americano(double price, String name, int milliliters) {

        super(price, name, milliliters);
    }

    public void privateMethodsAmer() {
        super.coffeeInfo();
    }

    public void methodsPrAmer() {
        super.prepareCoffee();
        super.payCoffee();
    }
}
