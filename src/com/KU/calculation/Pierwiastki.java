package com.KU.calculation;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pierwiastki {
    public static void main(String[] args) {

        //pierwiastki równania kwadratowego
        //w postaci ax^2 + bx +c

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int a = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int b = scanner.nextInt();
        System.out.print("Podaj trzecią liczbę: ");
        int c = scanner.nextInt();

        double delta = Math.pow(b,2) -4 * a *c;
        double square = Math.sqrt(delta);
        double pierw1=(-b+square)/(2*a);
        double pierw2=(-b-square)/(2*a);

        System.out.printf("Wynik %dx^2 + %dx + %d\n", a, b, c);
        System.out.println(delta);
        System.out.println(pierw1);
        System.out.println(pierw2);

    }
}
