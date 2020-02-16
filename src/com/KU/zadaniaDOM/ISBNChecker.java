package com.KU.zadaniaDOM;

import java.util.Scanner;

public class ISBNChecker {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        //get the ISBN
        System.out.print("Enter an ISBN: ");

        String isbn = sc.nextLine();
        sc.close();

// strip out spaces and dashes by replacing with empty char

       // isbn = isbn.replace(" ","").replace("-","");
        isbn = isbn.replaceAll("( |-)", "");

        // check depending on length

        boolean isValid = true;
        if(isbn.length()==10){
            isValid = CheckISBN10(isbn); //tę metodę implementujesz poniżej
        } else if (isbn.length()==13){
            isValid= CheckISBN13(isbn); //tę metodę implementujesz poniżej
        } else {
            isValid = false;
        }

        // print chek status

        if(isValid){
            System.out.println(isbn + " is a valid ISBN");
        } else {
            System.out.println(isbn + " is not a valid ISBN");
        }


    }

    //check a 10 digit ISBN: whether isbn is valid in 10 digit scheme
    //  poniżej implementujesz metody powyższe, tj. CheckISBN...
    // "isbn" poniżej to jest argument
    private static boolean CheckISBN10(String isbn) {

        // sum the digits times 10,9,...,1, respectively

        int sum=0;
        String dStr;
        for (int d=0; d<10; d++){
            dStr = isbn.substring(d, d+1);
            if(d<9 || dStr != "X"){
                sum+= Integer.parseInt(dStr)*(10-d);
            } else{
                sum+=10;
            }
        }
        return(sum%11==0);
    }

    //check a 13 digit ISBN: whether isbn is valid in the 13 digit scheme
    private static boolean CheckISBN13(String isbn) {

        // sum the digits times 1,3,1,3,...1, respectively

        int sum=0;
        //String dStr;
        int dVal;
        for( int d=0; d<13; d++){ //13 bo sprawdzasz ostatnią liczbe kontrolną
           // dStr = isbn.substring(d,d+1);
            dVal = Integer.parseInt(isbn.substring(d,d+1));
            if(d%2==0){ //if we have an odd digit
                sum+= dVal*1;
            } else{
                sum+= dVal*3;
            }
        }

        return (sum%10==0);

    }

}
