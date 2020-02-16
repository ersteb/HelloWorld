package com.KU.loops;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {


        /* 1 - z błędem:

        System.out.println("Podaj liczbę: ");

        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();


        int i=0;
        while(i<x) {

            i=i-1;

            System.out.printf("Bomba wybuchnie za %d\n", i);
        }

        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int i = scanner.nextInt();
        while (i > 0) {
            i = i - 1;
            System.out.println("Bomba wybuchnie za: " + i);
        }
    }
}
