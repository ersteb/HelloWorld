package com.KU.day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexd5 {

    public static void main(String[] args) {

        //account
        //account2

        Pattern pattern = Pattern.compile("account\\d*"); //? 0 lub 1 wystąpień
        Matcher account = pattern.matcher("account 632323");

        if(account.matches()){
            System.out.println("tak pasuje");
        }
        else{
            System.out.println("nie pasuje");
        }
    }
}
