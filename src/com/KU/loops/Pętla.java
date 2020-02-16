package com.KU.loops;

import java.util.Scanner;

public class Pętla {
    public static void main(String[] args) {
    /* 1:

        int p=5;
        int k=0;

        for(int i=k; i<p; i++){
            System.out.println(i+1);
        }
   */
/*
        // 2:

        System.out.println("Podaj liczbę: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = x; i >= 0; i--) {

            System.out.printf("Bomba wybuchnie za %d\n", i);
        }
*/

      /* 3.

        System.out.println("Podaj liczbę: ");


        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();

        System.out.println("Podaj dzielnik: ");
        int y= sc.nextInt();

        for (int i=x-1; i>0; i--) {
if(i%y==0){
            System.out.println(i);}
        }
        */


       /* 4.

        System.out.println("Podaj liczbę: ");

        Scanner sc=new Scanner(System.in);
        double x= sc.nextDouble();

        System.out.println("Podaj dzielnik: ");
        double y= sc.nextDouble();

        for (double i=x; i>0; i--) {
            if(i%y==0 && i!=x){
                System.out.println(i);}
        }
        */

      /* 5:

       int wynik;

        System.out.println("Podaj liczbę n: ");


        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        System.out.println("Podaj potęgę m: ");
        int m= sc.nextInt();
wynik=n;
        for (int i=m-1; i>0; i--) {
            wynik= wynik * n;

        }
        System.out.println("Wynik: "+ wynik);

*/


        // 6: WYZNACZANIE POTĘGI LICZB


        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int n = sc.nextInt();

        System.out.println("Podaj potegę:");
        int m = sc.nextInt();


        int power = 1;
        for (int i = 1; i <= m; i++) {
            power = power * n;
            System.out.println(power);
        }
        System.out.printf("%d to the power of %d is %d\n", n, m, power);
//

        //*7: WYZNACZANIE POTĘGI LICZB Z WARUNKAMI if

/*
        long n, p, r = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");

        n = sc.nextLong();

        System.out.println("enter power");

        p = sc.nextLong();

        if (n >= 0 && p == 0) {
            r = 1;
        } else if (n == 0 && p >= 1) {
            r = 0;
        } else {
            for (int i = 1; i <= p; i++) {
                r = r * n;
            }
        }

        System.out.println(n + "^" + p + "=" + r);
*/
    }

}

//


