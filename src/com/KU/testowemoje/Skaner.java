package com.KU.testowemoje;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Skaner {
    public static void main(String[] args) {

        // numer 1:

        Scanner sc=new Scanner(System.in);
        System.out.println("podaj liczbę:");
        int a= sc.nextInt();

        System.out.println("podaj drugą liczbę:");
        int b=sc.nextInt();

        System.out.printf("Wynik %d + %d = %d", a, b, a+b);

        // numer 2:

        Scanner scan= new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String text= scan.nextLine();

        System.out.println("Podaj wiek: ");
        int age = scan.nextInt();

        System.out.println("Podaj wysokośc wypłaty: ");
        double salary = scan.nextDouble();

        System.out.println("Witaj "+text);
        System.out.println("Twój wiek to "+age);
        System.out.println("Twoja wypłata to "+salary);

    }
}
