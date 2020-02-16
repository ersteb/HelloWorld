package com.KU.loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int one;
        Scanner scanner = new Scanner(System.in);
        do {
            one = scanner.nextInt();
            for (int i = one ; i > 0; i--) {
                System.out.println("Hello world " + i);
            }            }
        while (one > 0);

    }
}
