package com.KU.tablice;

public class Calculator {

    public int add(int a, int b){ // public niepotrzebne, jeżeli wpiszemy void zamiast int, to nic nam nie zwraca
        // z int add, potrzebny jest return
        return a+b;
    }

    public static void main(String[] args) {
        Calculator calculator= new Calculator();
        int sum = calculator.add(7,3);
        System.out.println(sum);
    }
}
