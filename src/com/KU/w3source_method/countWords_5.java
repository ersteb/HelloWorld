package com.KU.w3source_method;

import java.util.Scanner;

public class countWords_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the string: ");
        String str = sc.nextLine();

        System.out.println("Number of words in a string: " + count_words(str) + "\n");
    }

    public static int count_words(String str) {
        int count = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
        {

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {

                    count++;
                }
            }
            count = count + 1;

        }
        return count;
    }



}
