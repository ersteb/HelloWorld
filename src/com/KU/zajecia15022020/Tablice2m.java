package com.KU.zajecia15022020;

import java.util.Random;

public class Tablice2m {


    public static void main(String[] args) {


        Random rand = new Random();

        int[][] liczby = new int[5][5];
        for (int i = 0; i < liczby.length; i++) {
            for (int j = 0; j < liczby[0].length; j++) {  // {0} bo może być różna ilość elementów
                liczby[i][j] = 50 + rand.nextInt(50);  //losuje liczby od 50 do 99
            }
        }

        printTab2D(liczby);


        int liczby1[][] = createTab(10, 15);
        System.out.println();
        printTab2D(liczby1);

    }

    public static void printTab2D(int[][] liczby) {
        for (int i = 0; i < liczby.length; i++) {
            for (int j = 0; j < liczby[0].length; j++) {
                System.out.print(liczby[i][j] + " ");
            }
            System.out.println();

        }
    }




    public static int[][] createTab(int H, int W) {


        Random rand = new Random();

        int[][] liczby = new int[H][W];

        for (int i = 0; i < liczby.length; i++) {
            for (int j = 0; j < liczby[0].length; j++) {  // {0} bo może być różna ilość elementów
                liczby[i][j] = 50 + rand.nextInt(50);  //losuje liczby od 50 do 99
            }
        }
        return liczby;

    }
}

// zadanie domowe:
//Metoda: transpozycja tablicy

//public static int[][]createTab(int[][]tab){
//
//        }

// ctrl slash - komentuje odkomentowuje całość