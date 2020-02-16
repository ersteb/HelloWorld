package com.KU.zajecia15022020;

import java.util.Random;

import static com.KU.zajecia15022020.Tablice1.printTab;


public class Sorting {
    public static final int SIZE = 900;

    public static void main(String[] args) {

        Random rand = new Random();
        int tab[] = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            tab[i] = rand.nextInt(100);

        }

//wpisz printTab() i wcisnij alt enter, import static, i możesz używać metodę z innej klasy w ramach tego pakietu

        //nieposortowane:

        printTab(tab);

        // posortowane bąbelkowo:

        long t1 = System.currentTimeMillis();
        BubbleSort(tab);
        long t2 = System.currentTimeMillis();
        printTab(tab);
        System.out.println("Czas sortowania: " + (t2 - t1) + "ms");

        // posortowane warunkowo:

        t1 = System.currentTimeMillis();
        SelectionSort(tab);
        t2 = System.currentTimeMillis();
        printTab(tab);
        System.out.println("Czas sortowania: " + (t2 - t1) + "ms");


    }

    public static void BubbleSort(int[] tab) {

        int temp; //zmienna pomocnicza, by zamienić kolejność liczb

        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }

            }
        }
    }

    public static void SelectionSort(int[] tab) {

        int pmin, temp;
        for (int i = 0; i < tab.length - 1; i++) {
            pmin = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] < tab[pmin]) pmin = j;
            }
            temp = tab[pmin];
            tab[pmin] = tab[i];
            tab[i] = temp;
        }
    }
}
