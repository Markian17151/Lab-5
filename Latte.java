package com.company;

import java.util.Scanner;

public final class Latte extends Coffee {
    public Latte(double price, String name, int milliliters) {

        super(price, name, milliliters);
    }

    public void privateMethodsLat() {
        super.coffeeInfo();
    }

    public void methodsPrLat() {
        super.prepareCoffee();
        super.payCoffee();
    }
}

