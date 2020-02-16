package com.KU.testowemoje;

import java.util.Scanner;

public class PętleTest {
    public static void main(String[] args) {

        // numer 1:

        /*
        double num, sroot, rerr;
        for (num=1.0; num<31.0; num++){
            sroot=Math.sqrt(num);
            System.out.println("Liczba kwadratowa z liczby "+num+" wynosi "+sroot);

            rerr=num-(sroot*sroot);
            System.out.println("Reszta od zaokrąglenia to "+rerr);
            System.out.println();


        }
        */

//numer 2:
        /*
        int a;
        for(a=30; a>=-30; a -=5){
            System.out.println(a);
        }
        */

        //numer 3:
/*
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą dodatnią: ");
        int liczba = scan.nextInt();
        int i;
        for (i = liczba; i >= 0; i--) {
            System.out.println("Bomba wybuchnie za..." + i + " sekund");
        }

        */

/* numer 4:

        Scanner sc= new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int x = sc.nextInt();

        System.out.println("Podaj dzielnik: ");
        int y = sc.nextInt();

        int i;
        for(i=x-1; i>0; i--){

                if(i%y==0){

            System.out.println(i);}
        }

*/

/* NUMER 5:

        int i = 0;
        while (i<10){
            System.out.println("hello"+i);
            i++;
        }
        */
/* Numer 6: litery alfabetu odwrotnie

        char alfabet;

        alfabet = 'z';
        while(alfabet>='a'){
            System.out.println(alfabet);
            alfabet--;
        }
*/
/* Numer 7 - loop while bomba:

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą:");
        int a = sc.nextInt();

        while(a>=0){
            System.out.println("Bomba wybuchnie za sekund: "+a);
            a--;
        }
*/

// Numer 8 - loop while suma liczb poprzedzających zadaną:
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą:");
        int a = sc.nextInt();

        while(a>0){
            a--;
            int sum += a;

        }

        System.out.println(sum);
*/

        int e;
        int result;
        for(int i=0; i<10; i++){
            result=1;
            e=i;
            while(e>0){
                result *=2;
                e--;
            }
            System.out.println("2 to the power of " + i + " is " + result);
        }


    }
}
