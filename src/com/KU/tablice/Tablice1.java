package com.KU.tablice;

import java.util.Arrays;
import java.util.Scanner;

public class Tablice1 {
    public static void main(String[] args) {

        //zadanie 1:
        /*
        String[] imiona = new String[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<imiona.length; i++){
            System.out.print("Podaj imię: ");
            imiona[i]=sc.nextLine();
        }

       // for(int i=0; i<imiona.length; i++) {
         //  System.out.println(imiona[i]);

            System.out.println(Arrays.toString(imiona));
       // }

*/

        //zadanie 2:
 //
      /*
Scanner sc = new Scanner(System.in);
        System.out.println("Ile liczb chcesz podać?");
        int n = sc.nextInt();
        int[] numbers = new int[n];



        for(int i=0; i<numbers.length; i++) {
            System.out.println("Podaj liczbę:");
            numbers[i]=sc.nextInt(); // 0
        }
        int i=0;
        while(i < n){
            System.out.println(numbers[i]);
            i++;
        }
        */
//

        //zadanie 3a:

     //  int[] numbers = {1, 3, 5, 10};

        // zadanie 3b:

        //   System.out.println(numbers[0]);
        // System.out.println(numbers[1]);
        //System.out.println(numbers[2]);
        //System.out.println(numbers[3]);

        // zadanie 3c:

        //    for (int i=0; i<numbers.length; i++){
        //      System.out.println(numbers[i]);

        // Parzyste indeksy
        /*
        for (int i = 0; i<numbers.length; i+=2) {
            System.out.println(numbers[i]);

        }
         */

        // Parzyste liczby:

        /*
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {

                System.out.println(numbers[i]);
            }

        }
        */

        //Odwrotna kolejność

      //  for (int i = numbers.length - 1; i >= 0; i--) {
       //     System.out.println(numbers[i]);

        }


    }

