package com.KU.loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class Warunki {
    public static void main(String[] args) {


        if (2 > 3) {
            System.out.println("ok");
        } else {
            System.out.println("false");
        }

        if (4 < 5) {
            System.out.println("ok");
        } else {
            System.out.println("false");
        }

        if ((2 - 2) == 0) {
            System.out.println("ok");
        } else {
            System.out.println("false");
        }

        if (true) {
            System.out.println("ok");
        } else {
            System.out.println("false");
        }

        if (9 % 2 == 0) {
            System.out.println("ok");
        } else {
            System.out.println("false");
        }

        if (9 % 3 == 0) {
            System.out.println("ok");
        } else {
            System.out.println("false");
        }

        int a = 3;
        int b = 3;
        if (a > b) {
            System.out.println(("a>b"));
        } else if (a < b) {
            System.out.println(("a<b"));
        } else if (a == b) {
            System.out.println(("a=b"));
        } else {
            System.out.println("nic");
        }


        int d = 34;
        switch (d) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println("Other");
        }

      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int p= sc.nextInt();
                switch (p%2) {
                    case 0:

                        System.out.println("parzyste");

 break;
                    default:
                        System.out.println("nieparzyste");

                }
                */

          /*      Scanner sex = new Scanner(System.in);
        System.out.println("Podaj imię");
        String name = sex.nextLine();
int index = name.lastIndexOf('a'); //index liczy od 0
int length = name.length(); //length liczy od 1

        switch (index-length){
            case -1:
                System.out.println("kobieta");
                break;

            default:
                System.out.println("facet");
        }
        */

       // name.charAt(name.length()-1);

      /*  char charAt = name.charAt(name.length()-1);
        switch (charAt) {
            case 'a':
                System.out.println("Kobieta");
                break;
            default:
                System.out.println("Facet");
        }

*/

     /*   Scanner sc= new Scanner(System.in);
        sc.useLocale(Locale.US); //przejście na ustawienia amerykańskie (przecinki)
int i = sc.nextInt()


      */
      /*
        System.out.println("podaj liczbę:");
        double a=sc.nextDouble();

        System.out.println("podaj kolejną liczbę:");
        double b=sc.nextDouble();

        System.out.printf("Wynik %d + %d =%d"), a, b, a+b);

       */


    }





}
