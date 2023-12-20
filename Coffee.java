package com.company;

import java.util.Scanner;

public abstract class Coffee {
    private double price;
    private String name;
    private int milliliters;

    public Coffee(double price, String name, int milliliters) {
        this.price = price;
        this.name = name;
        this.milliliters = milliliters;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getMilliliters() {
        return milliliters;
    }

    public void coffeeInfo() {
        System.out.println("Кава: " + name + "   Ціна: " + price + "   Розмір в мл: " + milliliters);
    }

    public String buyCoffee(int sugarLevel) {
        if (sugarLevel >= 0 && sugarLevel <= 2) {
            return "Ваша кава: " + name + " буде готова з " + sugarLevel + " ложками цукру після оплати";
        } else {
            return "Ви ввели число не рівне 0, 1, 2";
        }
    }

    public final void payCoffee() {
        System.out.println("Сума до оплати: " + price + " грн");
        System.out.println("Введіть суму оплати:");
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        double totalCost = price;
        if (payment >= totalCost) {
            double change = payment - totalCost;
            System.out.println("Спасибі за оплату! Ваша решта: " + change + " грн");
        } else {
            System.out.println("Недостатньо коштів для оплати.");
        }
    }

    public void prepareCoffee() {
        System.out.println("Ваша кава: " + name + " готується");
    }
    public void preparePrCoffee() {
        System.out.println("Ваша кава: " + name + " " + milliliters + " готується");
    }

    static void recursiveMethod(String str, int count) {

        if (count <= 0) {
            return;
        }

        System.out.println("Запуск ракети\uD83D\uDE80 " + str);

        recursiveMethod(str, count -1);

    }

}

