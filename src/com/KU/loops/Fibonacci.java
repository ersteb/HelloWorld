package com.KU.loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n, first = 0,next = 1;
int sum;

        System.out.println("Enter how many fibonnaci numbers to print");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.print("The first " + n + " Fibonacci numbers are: 0");
        for (int i = 0; i<=n-2; i++)
        {
            sum = first + next;
            first = next;
            next = sum;
            System.out.println(sum);
        }
    }
}
