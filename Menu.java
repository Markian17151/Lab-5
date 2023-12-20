package com.company;

import java.util.Scanner;

public class Menu {
    public static void menuPrint() {

        Espresso espresso = new Espresso(28.5, "Еспресо", 250);
        Latte latte = new Latte(32, "Лате", 500);
        Americano americano = new Americano(26, "Американо", 250);

        // Меню
        System.out.println("Меню гарячих напоїв!");
        espresso.privateMethodsEsp();
        latte.privateMethodsLat();
        americano.privateMethodsAmer();

        // Вибір напою
        System.out.println("Виберіть свою каву:");
        System.out.println("1. Еспресо");
        System.out.println("2. Лате");
        System.out.println("3. Американо");

        Scanner scanner = new Scanner(System.in);
        int drink = scanner.nextInt();

        if (drink == 1) {
            System.out.println("Ваша кава: " + espresso.getName() + " готується");
            System.out.println("Виберіть кількість цукру:");
            System.out.println("0. Нуль ложок цукру");
            System.out.println("1. Одна ложка цукру");
            System.out.println("2. Дві ложки цукру");
            int scanner1 = scanner.nextInt();
            System.out.println(espresso.buyCoffee(scanner1));
            espresso.methodsPrEsp();
        } else if (drink == 2) {
            System.out.println("Ваша кава: " + latte.getName() + " готується");
            System.out.println("Виберіть кількість цукру:");
            System.out.println("0. Нуль ложок цукру");
            System.out.println("1. Одна ложка цукру");
            System.out.println("2. Дві ложки цукру");
            int scanner1 = scanner.nextInt();
            System.out.println(latte.buyCoffee(scanner1));
            latte.methodsPrLat();
        } else if (drink == 3) {
            System.out.println("Ваша кава: " + americano.getName() + " готується");
            System.out.println("Виберіть кількість цукру:");
            System.out.println("0. Нуль ложок цукру");
            System.out.println("1. Одна ложка цукру");
            System.out.println("2. Дві ложки цукру");
            int scanner1 = scanner.nextInt();
            System.out.println(americano.buyCoffee(scanner1));
            americano.methodsPrAmer();
        } else {
            System.out.println("Ви ввели число не рівне 1, 2, 3");
        }

        // Запуск ракети
        System.out.println("Бажаєте запустити ракету на москву?");
        System.out.println("1. Так");
        System.out.println("2. Ні");
        int sc = scanner.nextInt();
        if (sc == 1) {
            System.out.println("Кількість ракет:");
            int scanner1 = scanner.nextInt();
            espresso.recursiveMethod("Успішно долетіла!", scanner1);
        } else if (sc == 2) {
            System.out.println("Гарного дня!");
        } else {
            System.out.println("Виберіть \"Так/Ні\" ");
        }
    }

}
