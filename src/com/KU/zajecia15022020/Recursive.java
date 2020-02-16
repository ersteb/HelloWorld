package com.KU.zajecia15022020;

public class Recursive {

    public static void main(String[] args) {
//silnia:

        int n = 20;
        int r = silnia(n);
        System.out.println(n + "!= "+r);

//fibonacci:

        int p=fibonacci(n);
        System.out.println(("Wartość ciągu Fibonacciego dla liczby "+n+" wynosi "+p));
    }
//silnia:

    public static int silnia(int n){
        if(n == 0) return 1;
        return n * silnia(n-1); //else niepotrzebny tutaj
    }


    //fibonacci:

    public static int fibonacci(int n){

        if(n == 0 || n==1) return n;
        return fibonacci(n-1) + fibonacci(n-2);

    }

}
