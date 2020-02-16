package com.KU.loops;

import java.util.Scanner;

public class While3 {

    public static void main(String[] args) {
        /*

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int i = scanner.nextInt();
        int wynik =i;
        while (i > 0) {
            wynik = wynik+ i-1;
          i--;
            System.out.println("Suma wynosi: " + wynik);
        }

        */



        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int sum=0;
        while (i>0) {
           // sum=sum+1;
            sum +=i;
            i--;
        }
        System.out.printf("Sum: %d", sum);

    }
}
