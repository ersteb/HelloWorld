package com.KU.loops;

import java.nio.charset.Charset;
import java.util.Scanner;


public class ZadaniaDom {

    public static void main(String[] args) {

        //Zadanie 1 - Fizz_Buzz game:
/*

        Scanner sc = new Scanner(System.in);
        System.out.println("Give number:");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (((i % 5) == 0) && ((i % 3) == 0)) // Czy podzielne przez 5 & 3?
                System.out.println("FizzBuzz");
            else if ((i % 5) == 0) // Czy podzielne przez 5?
                System.out.println("fizz");
            else // niepodzielne przez 5 lub 3
                if ((i % 3) == 0) // Czy podzielne przez 3?
                System.out.println("buzz");
            else System.out.println(i);
        }
*/
//
        //
        //Koniec Zadanie 1.

        /* Zadanie 1a - Fizz_Buzz game_modified:

        Scanner sc = new Scanner(System.in);
        System.out.println("Giver number:");
        int num = sc.nextInt();


        if (((num % 5) == 0) && ((num % 3) == 0)) // Czy podzielne przez 5 & 3?
            System.out.println("FizzBuzz");
        else if ((num % 5) == 0) // Czy podzielne przez 5?
            System.out.println("Fizz");
        else if ((num % 3) == 0) // Czy podzielne przez 3?
            System.out.println("Buzz");
        else
            System.out.println("Next Please :-)"); // niepodzielne przez 5 lub 3

*/
// Koniec Zadanie 1a.


        // Zadanie 2 - średnia z wprowadzonych liczb
        //jak dodać warunek odnośnie liczb ujemnych??????????????????????
/*
        int n, count = 1;
        float  xF, averageF, sumF = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Z ilu n liczb ma się składać suma?");
        n = sc.nextInt();
        while (count <= n)
        {
            System.out.println("Wpisz liczbę o numerze "+count+":");
            xF = sc.nextInt();

            sumF += xF;
            count++;
        }
        averageF = sumF/n;
        System.out.println("Srednia wprowadzonych liczb wynosi: "+averageF);
        System.out.println("Suma wprowadzonych liczb wynosi: "+sumF);
        */
        // Koniec Zadanie 2.

        // Zadanie 3 - rozmienianie kwoty na monety:
/*
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj kwotę: \n");
        int kwota = sc.nextInt();

        int il_50=0, il_20=0, il_10=0, il_5=0, il_2=0, il_1=0;
        int x, x50, x20, x10, x5, x2, x1;

        x=kwota;
        System.out.println("Kwota wyjściowa: "+x);

        while(kwota>=50)
        {
            il_50+=1;
            kwota = kwota - 50;
        }
        x50=kwota;
        System.out.println("Kwota pozostała po odjęciu 50ek: "+kwota+"\nLiczba 50-tek: "+(x-x50)/50);
        while(kwota>=20)
        {
            il_20+=1;
            kwota = kwota - 20;

        }
        x20=kwota;
        System.out.println("Kwota po odjęciu 20ek: "+kwota+"\nLiczba 20-tek: "+(x50-x20)/20);
        while(kwota>=10)
        {
            il_10+=1;
            kwota = kwota - 10;
        }
        x10=kwota;
        System.out.println("Kwota po odjęciu 10ek: "+kwota+"\nLiczba 10-tek: "+(x20-x10)/10);
        while(kwota>=5)
        {
            il_5+=1;
            kwota = kwota - 5;
        }
        x5=kwota;
        System.out.println("Kwota po odjęciu 5ek: "+kwota+"\nLiczba 5-tek: "+(x10-x5)/5);
        while(kwota>=2)
        {
            il_2+=1;
            kwota = kwota - 2;
        }
        x2=kwota;
        System.out.println("Kwota po odjęciu 2ek: "+kwota+"\nLiczba 2-tek: "+(x5-x2)/2);
        while(kwota>=1)
        {
            il_1+=1;
            kwota = kwota - 1;
        }
        x1=kwota;
        System.out.println("Kwota po odjęciu jedynek: "+kwota+"\nLiczba 1-tek: "+(x2-x1));

        */
        // Zadanie 4 - odwrócenie liczby całkowitej:
/*
        int liczba = 0;
        int odwrotna = 0;
        System.out.println("Podaj liczbę i wciśnij enter: ");
        Scanner in = new Scanner(System.in);
        //Captured input would be stored in number num
        liczba = in.nextInt();
        //While Loop: Logic to find out the reverse number
        while (liczba != 0) {
            odwrotna = odwrotna * 10;
            odwrotna = odwrotna + liczba % 10;
            liczba = liczba / 10;
        }

        System.out.println("Liczba odwrotna do początkowej to: \n" + odwrotna);
*/

        // Zadanie 5 - wyświetlanie liczby największej:

/*
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: \n");
        int number1 = sc.nextInt();

        System.out.print("Podaj drugą liczbę: \n");
        int number2 = sc.nextInt();

        System.out.print("Podaj trzecią liczbę: \n");
        int number3 = sc.nextInt();

        System.out.println("Liczba największa to: \n"+Math.max((Math.max(number1, number2)),number3));
      */

        // Zadanie 6 - liczba całkowita - który dzień tygodnia:
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int i = sc.nextInt();

        switch(i){
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Sroda");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Invalid number");

        }
*/
        // Zadanie 7 - Litera: samogłoska, czy spółgłoska?
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj literę: ");
        char x = sc.next().charAt(0);

               if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='y')
        System.out.println(x+" to samogłoska");
        else
        System.out.println(x+" to spółgłoska");
*/


        // Zadanie 8 - PESEL:
/*
        String pesel ="84081013478";

        int c1 =pesel.charAt(0) - 48; //charAt używamy by pobrać konkretną cyfrę
        int c2 =pesel.charAt(1) - 48;
        int c3 =pesel.charAt(2) - 48;
        int c4 =pesel.charAt(3) - 48;
        int c5 =pesel.charAt(4) - 48;
        int c6 =pesel.charAt(5) - 48;
        int c7 =pesel.charAt(6) - 48;
        int c8 =pesel.charAt(7) - 48;
        int c9 =pesel.charAt(8) - 48;
        int c10 =pesel.charAt(9) - 48;

        int sum = 9*c1 + 7*c2+ c3*3+ c4+ c5*9 + c6*7 + c7*3 + c8*+ c9*9 + c10*7;

        int control = sum%10;

        if(control==c10) {
            System.out.println("Twój pesel jest poprawny");
        }
        else{
            System.out.println("niepoprawny");
        }

*/
        // Zadanie 9 - czy liczba jest pierwsza:
/*
        int temp;
        boolean isPrime=true;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter any number:");
        //capture the input in an integer
        int num=scan.nextInt();
        scan.close();
        for(int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not
        if(isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
*/
        // Zadanie 10 - czy liczba jest doskonała:
/*
        long n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextLong();
        int i=1;
        while(i<=n/2)
        {
            if(n%i==0)
            {
                sum+=i;
            }
            i++;
        }
        if(sum==n)
        {
            System.out.println(n+" is a perfect number");
        }
        else
            System.out.println(n+" is not a  perfect number");
*/

        // Zadanie 11 - czy w danym PESEL jest kobieta czy facet:
/*
        long n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextLong();

        long x = Math.abs((n % 100) / 10L);

        if (x % 2 == 0) {
            System.out.println("Liczba przedostatnia to: " + x);
            System.out.println("Dlatego dana osoba to kobieta");
        }
        else {
            System.out.println("Liczba przedostatnia to: " + x);
            System.out.println("Dlatego dana osoba to mężczyzna");
        }

        */

        // Zadanie 12 - suma wielokrotności liczb 3 lub 5:
        /*
int sum=0;
for(int i=3;i<1000;i++) {  //1 lub 2 nie sa wielokrotnościa naszej liczby, stąd pomijamy

    if(i%3==0 || i%5==0){
        sum +=i;
    }

}

        System.out.println(sum);
*/

    }
}
