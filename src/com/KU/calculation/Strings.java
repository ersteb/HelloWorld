package com.KU.calculation;

public class Strings {
    public static void main(String[] args) {
        int age = 30;
        String text = new String("Hello there");

        String text2= String.format("%s: %d", "My age is ", age);
        String text3= String.format("%.2f",84.23244);
        String text4= String.format("%.3f",84.23244);
        System.out.println(text); //now alinia na końcu

        float a= 6.8669698f;
        System.out.printf("%.2f%n", a);


        System.out.println(text);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);



                        int liczba = 24;
        System.out.printf("%x\n",liczba);
        System.out.println(liczba);

        System.out.println(3==3 && 3==4);
        System.out.println(3!=3 || 3==5);
        System.out.println((2+4) > (1+3));
        System.out.println("cos" .equals ("cos"));
        System.out.println("cos" == "cos");// tekstu nie można porównywać za pomocą ==, ale trzeba zamiast .equals





    }
}
