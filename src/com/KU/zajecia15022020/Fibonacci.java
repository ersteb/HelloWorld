package com.KU.zajecia15022020;

public class Fibonacci {

    public static void main(String[] args) {
        int n=5;
        int r=fibonacci(n);
        System.out.println(("Wartość ciągu Fibonacciego dla liczby "+n+" wynosi "+r));

    }

public static int fibonacci(int n){

        if(n == 0 || n==1) return n;
        return fibonacci(n-1) + fibonacci(n-2);

}

}
