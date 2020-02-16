package com.KU.loops;
import java.util.Random;
import java.util.Scanner;

public class Random1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random generator1 = new Random();
        int proba = 0;
        long strzal = 0;
        long wylosowanaLiczba = generator1.nextLong();
        System.out.println("Losuje liczbe z zakresu od 0 do 100 ");
        System.out.println(wylosowanaLiczba);
        while (strzal != wylosowanaLiczba) {
            System.out.println("Zgadnij jaka to liczba: ");
            strzal = input.nextLong();
            proba++;
            if (strzal < wylosowanaLiczba) {
                System.out
                        .println("Niestety, to za malo. Podaj wieksza liczbe");
            } else if (strzal > wylosowanaLiczba) {
                System.out.println(
                        "Podana liczba to za duzo. Podaj mniejsza liczbe");
            } else if (strzal == wylosowanaLiczba) {
                System.out.println("Bravo!Zgadles w probie: " + proba);
            }
            if (proba == 6){
                System.out.println("Przegrales");
                System.out.println("Liczba to: " + wylosowanaLiczba);
                return;
            }
        }

        }




}




