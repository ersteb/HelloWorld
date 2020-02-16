package com.KU.tablice2;

public class Przelewy {


    private float balance;

    public Przelewy(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    void transfer(float money, Przelewy account) {
        if (money > this.balance) {
            System.out.println("Za mało hajsów");
        } else {
            this.balance -= money;
            account.balance += money;
        }
    }
}
