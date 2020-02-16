package com.KU.zadaniaDOM;

import java.security.InvalidAlgorithmParameterException;
import java.util.Scanner;

public class EAN {

    public static void main (String[] args){

        String input = GetInput(); //get input from the user

        if (input.length() < 12) { //check to see if the input is too short
            try {
                throw new InvalidAlgorithmParameterException("That's not a long enough barcode! Give me the rest of the numbers!");
            } catch (InvalidAlgorithmParameterException e) {
                e.printStackTrace();
                return;
            }
        }
        if (input.length() > 12 ) { //check to see if the input is too long
            try{
                throw new InvalidAlgorithmParameterException("That's too long! You only need 12 numbers!");
            } catch (InvalidAlgorithmParameterException e){
                e.printStackTrace();
                return;
            }

        }
        int ans = checkSum(input); //pass that input to the checkSum function
        System.out.println(ans); //print out the checksum digit

        /**
         *
         */
    }

    public static String GetInput(){
        Scanner console = new Scanner(System.in);
        System.out.println("This program will take the first 12 numbers of a EAN13 barcode and compute the check number at the end of the code.");
        System.out.println("Please enter a EAN13 code: ");
        String EanCode = console.next();
        return EanCode;
    }

    public static int checkSum (String Input) {
        int evens = 0; //initialize evens variable
        int odds = 0; //initialize odds variable
        int checkSum = 0; //initialize the checkSum
        for (int i = 0; i < Input.length(); i++) {
            //check if number is odd or even
            if ((int)Input.charAt(i) % 2 == 0) { // check that the character at position "i" is divisible by 2 which means it's even
                evens += (int)Input.charAt(i);// then add it to the evens
            } else {
                odds += (int)Input.charAt(i); // else add it to the odds
            }
        }
        odds = odds * 3; //multiply odds by three
        int total = odds + evens; //sum odds and evens
        if (total % 10 == 0){ //if total is divisible by ten, special case
            checkSum = 0;//checksum is zero
        } else { //total is not divisible by ten
            checkSum = 10 - (total % 10); //subtract the ones digit from 10 to find the checksum
        }
        return checkSum;
    }

}
