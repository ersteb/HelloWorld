package com.KU.tablice;

public class TabliceWielowymiarowe {
    public static void main(String[] args) {
//przykład wstępny:
        
        /*
        int[][] a= new int [2][3]; // 2 wiersze, 3 kolumny

        a[0][0]=1; //wiersz 0, kolumna 0
        a[0][1]=2; //wiersz 0, kolumna 1
        a[0][2]=3;
        a[1][0]=4; //wiersz 1, kolumna 0
        a[1][1]=5;
        a[1][2]=6;

        for (int i = 0; i < a.length; i++) {
            for (int i1 = 0; i1 < a[i].length; i1++) {
                System.out.println(a[i][i1]);
            }
        }

        */

        // zadanie robione w grupie:
/*
        int[][] a= new int [5][5];

     // a[2][0]=1;
       // a[2][1]=1;
        //a[2][2]=1;
        //a[2][3]=1;
        //a[2][4]=1;

        for (int i = 0; i < a[2].length; i++) {
            a[2][i]=1;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
*/
        // zadanie 2:
/*
        int[][] a = new int[5][5];
        for (int i = 0; i < a[1].length; i++) { //a. length może być, bo liczba wierszy = liczba kolumn,
            // gdyby się różniły, to trzeba pisać np [2].length, czyli odniesienie do konkretnego wiersza w tabeli
            a[i][i] = i;
        }
        for (int i = 0; i < a.length; i++) {
            for (int i1 = 0; i1 < a[i].length; i1++) {
                System.out.print(a[i][i1] + " ");
            }
            System.out.println();
        }
*/
// zadanie 3:

/*
        int[][] a = new int[2][3];


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i * a[i].length + j;
            }

            }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
*/
        // zadanie 4 - klasa & obiekt



    }
}
