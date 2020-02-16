package com.KU.calculation;

import java.io.PrintStream;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        //pierwiastki równania kwadratowego
        //w postaci ax^2 + bx +c

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int a = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int b = scanner.nextInt();

        System.out.printf("Wynik %d + %d = %d", a, b, a+b);



    }
}
