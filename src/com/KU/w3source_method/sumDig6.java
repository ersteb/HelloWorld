package com.KU.w3source_method;

import java.util.Scanner;

public class sumDig6 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input an integer: ");
        int digits = sc.nextInt();
        System.out.println("The sum is "+ sumDigits(digits));
    }

    private static int sumDigits(long n) {
        int result = 0;

        while(n>0){
            result +=n%10;
            n/=10;
        }
        return result;
    }

}
