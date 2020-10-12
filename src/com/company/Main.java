package com.company;

public class Main {

    public static void main(String[] args) {

        // - A szám páros és hárommal osztható egyszerre

        int szam = 18;

        System.out.println("1. feladat: \nA szám a: " + szam);
        if (szam % 2 == 0 && szam % 3 != 0) {
            System.out.println("A szám páros, de nem osztható hárommal.");
        } else if (szam % 2 != 0 && szam % 3 != 0) {
            System.out.println("A szám páratlan és nem osztható hárommal.");
        } else if (szam % 2 != 0 && szam % 3 == 0) {
            System.out.println("A szám páratlan és osztható hárommal.");
        } else if (szam % 2 == 0 && szam % 3 == 0) {
            System.out.println("A szám páros és hárommal osztható.");
        } else if (szam == 0) {
            System.out.println("A szám nulla!");
        } else {
            System.out.println("Érvénytelen bemenet!");
        }

        // - Felfelé vagy lefelé kerekítjük a fizetendő összeget tört szám esetén? Írd ki a kerekített összeget is.

        double number = 18.3;
        int num = 0;

        System.out.println("\n2. feladat: \nA szám a: " + number);
        if (number % 1 * 10 < 5 && number % 1 * 10 != 0) {
            num = (int) (number / 1);
            System.out.println("Lefelé kerekítünk. Az összeg kerekítve: " + num);
        } else if (number % 1 * 10 >= 5 && number % 1 * 10 != 0) {
            num = (int) (number / 1) + 1;
            System.out.println("Felfelé kerekítünk. Az összeg kerekítve: " + num);
        } else if (number % 1 * 10 == 0) {
            System.out.println("Nem kell kerekíteni.");
        } else {
            System.out.println("Érvénytelen bemenet!");
        }

        // - Készíts dolgozat osztályozó logikai elágazás rendszert

        double szazalek = 69;
        byte osztalyzat = 0;

        System.out.println("\n3. feladat:");
        if (szazalek >= 0 && szazalek <= 100) {
            if (szazalek >= 60 && szazalek < 75) {
                osztalyzat = 3;
            } else if (szazalek >= 75 && szazalek < 90) {
                osztalyzat = 4;
            } else if (szazalek >= 40 && szazalek < 60) {
                osztalyzat = 2;
            } else if (szazalek >= 0 && szazalek < 40) {
                osztalyzat = 1;
            } else if (szazalek >= 90 && szazalek < 100) {
                osztalyzat = 5;
            }
            System.out.println("A dolgozat eredénye: " + szazalek + "% , az osztályzat: " + osztalyzat);
        } else {
            System.out.println("Érvénytelen bemenet!");
        }

        // - Állapítsd meg a belső  szögek mérete alapján, hogy a háromszög szerkeszthető-e

        int a = 50;
        int b = 100;
        int c = 30;

        System.out.println("\n4. feladat:");
        if (a + b + c != 180) {
            System.out.println("Érvénytelen bemenetek!");
        } else {
            System.out.println("A háromszög szerkeszthető.");
        }

        // - Állapítsd meg hogy az adott  év szökőév-e

        int evszam = 2000;

        System.out.println("\n5. feladat:");
        if (evszam > 0 && evszam <= 9999) {
            if (evszam % 4 == 0) {
                if ((evszam % 100 != 0 && evszam % 400 != 0) || (evszam % 100 == 0 && evszam % 400 == 0)) {
                    System.out.println("A(z) " + evszam + " szökőév.");
                } else if (evszam % 100 == 0 && evszam % 400 != 0) {
                    System.out.println("A(z) " + evszam + " nem szökőév.");
                }
            } else {
                System.out.println("A(z) " + evszam + " nem szökőév.");
            }
        } else {
            System.out.println("Érvénytelen bemenet!");
        }
    }
}
