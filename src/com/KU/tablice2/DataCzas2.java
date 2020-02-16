package com.KU.tablice2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Random;

import static java.time.LocalTime.now;

public class DataCzas2 {
    public static void main(String[] args) {
        //Create formatter

        // slajd 4/28: nowe API + obecny czas + dzień:

        DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm EEEE");

//Local time instance
       LocalDateTime localTime = LocalDateTime.now();

//Get formatted String
        String localTimeString = FORMATTER.format(localTime);

        System.out.println(localTimeString);

        // opcja 2:

    //    DateTimeFormatter koronacja = DateTimeFormatter.ofPattern("EEEE"); //ctrl alt v - tworzenie zmiennej z wyrażenia
      //  LocalDate localDate = LocalDate.of(1025, 04, 18);
        //System.out.println(koronacja.format(localDate));

        // opcja 3:
  /*
        for (Locale availableLocale : Locale.getAvailableLocales()) {
            System.out.println(availableLocale.getDisplayName() + " " +availableLocale.getLanguage());
                }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE", Locale.forLanguageTag("ccp"));
        LocalDate date = LocalDate.of(1025, 4, 18);   System.out.println(formatter.format(date));

*/

  // opcja 4:

    //    Duration between=Duration.between(LocalDateTime.of(1984, 8 ,10,12,0), LocalDateTime.now());
      //  System.out.println(between.getSeconds());
// opcja 5:

    //  Period dur=Period.between(LocalDate.of(1776, 7,4), LocalDate.now());
    // System.out.println(dur.getYears());
      //System.out.println(dur.toTotalMonths());

        //opcja 6:
/*
//teraz działa :-) :
      Duration between=Duration.between(LocalDateTime.of(1984,8,10,12,0,0), LocalDateTime.now());
      System.out.println(between.getSeconds());
       */
//prawidłowe rozwiązanie:
/*
        long between=ChronoUnit.DAYS.between(LocalDate.of(1025,4,18), LocalDate.now());
        System.out.println(between);
*/
        //opcja 7:
/*
        LocalDateTime now=LocalDateTime.now();
        LocalDateTime localDateTime = now.plusSeconds(56_342);
        System.out.println(localDateTime);
*/

// opcja 8:
/*
        int[] numbers =new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=new Random().nextInt();
        }
        int sum=0;
        for (int number : numbers) {
            sum = sum + number;

        }
        System.out.println(sum);
        */

//opcja 9:

/*
LocalDate date=LocalDate.now();
LocalDateTime.of(date, LocalTime.now());

LocalDate localDate=LocalDateTime.now().toLocalDate();

        System.out.println(LocalDate.now().isLeapYear());
        System.out.println(LocalDate.of(2001,5,5).isLeapYear()); //ten rok nie jest
        // przestępny
        System.out.println(LocalDateTime.MAX); // maksymalnie aką datę możesz w javie obsłużyć
*/
    }
}// jeżeli chcemy od razu na koniec przeskoczyć to f9,

//klikasz prawym i evaluate expression


