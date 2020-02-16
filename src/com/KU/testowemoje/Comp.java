package com.KU.testowemoje;
//
public class Comp {
    public static void main(String[] args) {
        Empl employee=new Empl("Karol", "Wolak",34);
        Empl employee2=new Empl("Stefan", "Majak",38);
        System.out.printf("Nowy pracownik nazywa się %s %s i ma %d lat", employee.getName(), employee.getLastName(), employee.getAge());
        System.out.printf("\nNowy pracownik nazywa się %s %s i ma %d lat", employee2.getName(), employee2.getLastName(), employee2.getAge());
    }
}
//