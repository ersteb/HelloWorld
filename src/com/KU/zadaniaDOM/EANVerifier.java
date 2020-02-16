package com.KU.zadaniaDOM;

import java.util.Scanner;

public class EANVerifier {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj kod EAN: ");
        String ean = sc.nextLine();
        sc.close();

        ean = ean.replaceAll("( |-)","");


        boolean isValid=true;
      //  if (ean.length()==8){
      //      isValid = CheckEAN8(ean);
      //  } else
            if(ean.length()==13){
            isValid = CheckEAN13(ean);
        } else{
            isValid=false;
        }

        if(isValid){
            System.out.println(ean + " to poprawny kod EAN.");
        } else {
            System.out.println(ean + " nie jest poprawnym kodem EAN.");
        }

    }

    private static boolean CheckEAN13(String ean) {
        int sum = 0;
        int dVal;
        for(int d=0; d<13; d++){
            dVal=Integer.parseInt(ean.substring(d,d+1));
            if(d%2==0){
                sum +=dVal*3;
            } else{
                sum +=dVal*1;
            }

        }
        return (sum%10==0);
    }
}
