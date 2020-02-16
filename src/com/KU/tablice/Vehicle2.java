package com.KU.tablice;

public class Vehicle2 {
    public static void main(String[] args) {

        Vehicle vehicle=new Vehicle(4, "czerwony",200);
                //po nawiasie wpisujesz ctrl p i wpisujesz same wartosci, bo masz podpowiedz
        //stworzysz nowy pojazd i podajesz 3 parametry
        System.out.printf("Pojazd ma %d koła, jest %s i może jechać " + "%d km/h", vehicle.getNumOfWheels(), vehicle.getColor(), vehicle.getVelocity());

        Vehicle vehicle1=new Vehicle(2,  "zielony");
        System.out.printf("\nPojazd ma %d koła, jest %s i może jechać " + "%d km/h", vehicle1.getNumOfWheels(), vehicle1.getColor(), vehicle1.getVelocity());
    }
}
