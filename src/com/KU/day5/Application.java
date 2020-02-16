package com.KU.day5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Application {
    static User[] USERS = new User[100];
    static int usersCount = 0;
    static DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-DD");

    public static void main(String[] args) {


        System.out.println("Witaj");
        System.out.println("Wybierz opcję podając numer");
        Scanner scanner = new Scanner(System.in);


        int option = 99;
        while (option != 0) {
            printMenu();
            option = scanner.nextInt();
            if (option == 1) {
                System.out.print("Podaj nazwę użytkownika: ");
                String userName = scanner.nextLine();
                System.out.print("Podaj email użytkownika: ");
                String email = scanner.nextLine();
                System.out.print("Podaj datę urodzin użytkownika: ");
                String birthdayStr = scanner.nextLine();
                LocalDate birthday = LocalDate.parse(birthdayStr, FORMAT);
                USERS[usersCount++] = new User(userName, email, birthday);
            } else if (option == 2) {
                System.out.println("Podaj date : ");
                String birthdayStr = scanner.nextLine();
                LocalDate birthday = LocalDate.parse(birthdayStr, FORMAT);
                for (int i = 0; i < USERS.length; i++) {
                    if (USERS[i].getBirthday().isBefore(birthday)) ;

                }
            }

            else if (option == 3) {
                System.out.println("Podaj date : ");
                String birthdayStr = scanner.nextLine();
                LocalDate birthday = LocalDate.parse(birthdayStr, FORMAT);
                for (int i = 0; i < USERS.length; i++) {
                    if (USERS[i].getBirthday().isAfter(birthday)) ;

                }
            }

            else if (option == 4) {
                System.out.println("Podaj date : ");
                String birthdayStr = scanner.nextLine();
                LocalDate birthday = LocalDate.parse(birthdayStr, FORMAT);
                for (int i = 0; i < USERS.length; i++) {
                    if (USERS[i].getBirthday().isEqual(birthday)) ;

                }
            }
                else{
                    System.out.println("Niepoprawny numer");
                }

            }
            // User[] users = new User[100];
            // users = Arrays.copyOf(users, 150)
        }

        private static void printMenu () {
            System.out.println("0. Zamknij aplikację");
            System.out.println("1. Dodaj użytkownika");
            System.out.println("2. Wypisz użytkowników, którzy urodzili się przed podaną datą");
            System.out.println("3. Wypisz użytkowników, którzy urodzili się po podanej dacie");
            System.out.println("4. Wypisz użytkowników, którzy urodzili się w dniu podanej daty");
        }
    }
