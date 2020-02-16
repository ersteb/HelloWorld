package com.KU.w3source_method;

import java.util.Scanner;

public class methods12 {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = sc.nextInt();
        printMatrix(n);
    }

    public static void printMatrix(int n) {

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print((int)(Math.random()*4) + " ");
            }
            System.out.println();
        }
    }

}
