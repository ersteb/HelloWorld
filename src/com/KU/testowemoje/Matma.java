package com.KU.testowemoje;

import java.util.function.DoubleToLongFunction;

import static java.lang.Math.*;


public class Matma {
    public static void main(String[] args) {

        double liczba=10.98798;
        int factor=3;
        var pierwiastek=sqrt(liczba);
        double potega=pow(liczba,factor);
        System.out.println("Pierwiastek z "+liczba+" to jest "+pierwiastek);
        System.out.println("Liczba "+liczba+" do potęgi "+factor+" wynosi "+potega);


        double zmienna= Math.random();
        System.out.println(zmienna);

        boolean test=liczba<=factor;
        System.out.println(test);

        int a=5;

        int b=--a;

        int c=a/b;

        System.out.println(b);
        System.out.println(c);

        String tab= "Motor";
        System.out.println("mam\n"+tab);

        int system=68;
        System.out.println(Integer.toHexString(system));

        System.out.println(E);

        String text=new String ("hello2");
        System.out.println(text);

        int tydz=7;
        String gadka=String.format("%s %d %s", "Tydzień trwa", tydz,"dni");
        System.out.println(gadka);

        float dzies=9.6876876f;
        String zaokr=String.format("%s: %.3f","Liczba", dzies);
        System.out.println(zaokr);

        int wiek=35;
        System.out.println(Integer.toHexString(wiek));

        int wiek2=0x23;
        System.out.println(wiek2);



    }
}
