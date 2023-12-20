package com.company;

import java.util.Scanner;

public final class Espresso extends Coffee {
    public Espresso(double price, String name, int milliliters) {

        super(price, name, milliliters);
    }

    public void privateMethodsEsp() {
        super.coffeeInfo();
    }

    public void methodsPrEsp() {
        super.prepareCoffee();
        super.payCoffee();
    }
    public void methodsPereEsp() {
        super.preparePrCoffee();

    }
}
