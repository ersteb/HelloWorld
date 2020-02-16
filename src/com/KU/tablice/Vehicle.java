package com.KU.tablice;

public class Vehicle {

    private int numOfWheels; //to po prawej to pole
    private String color;
    private int velocity=100;

    public Vehicle(int numOfWheels, String color, int velocity){
        //^^- to jest konstruktor z argumentami
        //w konstruktorze znajdują się operacje wykonywane w trakcie inicjalizowania obiektu
        this.numOfWheels=numOfWheels;
        this.color = color;
        this.velocity=velocity;


    }
    // wpisać alt insert i wybrać getter albo constructor

    public Vehicle(int numOfWheels, String color) {
        this.numOfWheels = numOfWheels;
        this.color = color;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public String getColor() {
        return color;
    }

    public int getVelocity() {
        return velocity;
    }
}
