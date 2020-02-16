package com.KU.tablice2;

public class Przelewy2 {

    public static void main(String[] args) {

        Przelewy account =new Przelewy(1000);
        Przelewy account1=new Przelewy(800);


        account.transfer(1200, account1);
        System.out.println(("Przelew: " + account.getBalance()));
        System.out.println(("drugie: " + account.getBalance()));

        account.transfer(1.5F, account1);
        System.out.println(("Przelew: " + account.getBalance()));
        System.out.println(("drugie: " + account.getBalance()));

    }
}
