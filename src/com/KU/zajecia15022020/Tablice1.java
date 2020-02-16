package com.KU.zajecia15022020;

import java.util.Random;
import java.util.Scanner;

public class Tablice1 {

    public static final int SIZE = 10;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Stworzenie obiektu klasy Random, który posłuży do losowania liczb
        Random rand = new Random();

        int[] tab = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            tab[i] = rand.nextInt(10);  //tu jest jaki zakres liczb sie losuje

        }

        //metody umieszczane w psv MAIN - odnoszące się do tabeli o nazwie "tab":

        printTab(tab);
        printRevers(tab);
        printOddIndex(tab);
        printMod3(tab);
        System.out.println("Suma liczb = " + sum(tab));
        /*
        System.out.println("Suma czterech pierwszych liczb to " + sumN(tab, 4));
        int r = sumNback(tab, 5, 20);
        System.out.println("Suma n elementów od końca większych od m: " + r);
        int quantity = number(tab, 100);
        System.out.println("Ilość el.: " + quantity);

        System.out.print("Podaj dzielnik: ");
        //  int divider = sc.nextInt();
        //  printModN(tab, divider);
        printModN(tab, sc.nextInt());
*/
int t[] = find2Min(tab);
        System.out.println("2 min el.: (" + tab[t[0]] + ", " + tab[t[1]] + ")");
    }

    public static void printTab(int[] tab) {
        System.out.println("Liczby wylosowane to:");
        int i;//tu musimy int i zadeklarowac, bo ponizej i jest widoczny tylko w pętli

        // for (i = 0; i< SIZE - 1; i++) {  //-1 zeby ostatniego przecinka nie wyswietlilo

        for (i = 0; i < tab.length; i++) {  //użycie nazwy tablicy . jest lepsze
            System.out.print(tab[i] + " ");
        }
        // System.out.println(tab[i]);
        System.out.println();
    }


    public static void printRevers(int[] tab) {
        System.out.println("Liczby wypisane od końca:");
        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();

    }


    public static void printOddIndex(int[] tab) {
        int i;
        System.out.println("Liczby z indeksami na nieparzystych pozycjach to:");
        for (i = 1; i < tab.length; i += 2) {
            System.out.print(tab[i] + " ");
        }

        System.out.println();


    }


    public static void printMod3(int[] tab) {

        int i;
        System.out.println("Liczby podzielne przez 3 to:");
        for (i = 0; i < tab.length; i++) {
            if (tab[i] % 3 == 0) {


                System.out.print(tab[i] + " ");
            }
        }
        //  System.out.println(tab[i - 1]);
        System.out.println();
    }


    public static int sum(int[] tab) {
        int result = 0;
        for (int i = 0; i < tab.length; i++) {
            result += tab[i];
        }
        return result;
    }

    /*

    public static int sumN(int[] tab, int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += tab[i];
        }
        return result;
    }

    public static int sumNback(int[] tab, int n, int m) {
        int result = 0;
        for (int i = tab.length - 1; i > tab.length - 1 - n; i--) {
            if (tab[i] > m) {
                result += tab[i];

            }
        }
        return result;
    }

    //ilość liczb od początku tablicy by ich suma przekroczyła wartość n

    public static int number(int[] tab, int n) {
        int num = 0;
        int result = 0;

        for (int i = 0; i < tab.length; i++) {
            result += tab[i];


            if (result >= n) break;
            num++;
        }

        return num;


    }

    public static void printModN(int[] tab, int n) {

        int i;

        for (i = 0; i < tab.length; i++) {
            if (tab[i] % n == 0) {

                System.out.print(tab[i] + " ");
            }
        }
        System.out.println();
    }


    */


    // metoda zwraca dwa najmniejsze elementy z tablicy dwuwymiarowej:

    // na jutro
    public static int[] find2Min(int[] tab) {

        int p1, p2, temp;  //temp zmienna pomocnicza by pozamieniać indekxy
        p1 = 0;
        p2 = 1;

        if (tab[p1] > tab[p2]) {
            p1 = 1;
            p2 = 0;
        }
        int i = 2;
        while (i < tab.length){
            if(tab[i]<tab[p2]){
                p2=i;
                if(tab[p1]> tab[p2]){
                    temp = p1;
                    p1 = p2;
                    p2 = temp;
                }
            }
            i++;
        }
        int[] t = new int[2];
        t[0] = p1;
        t[1] = p2;
        return t;


    }


}
