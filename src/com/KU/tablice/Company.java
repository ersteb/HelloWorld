package com.KU.tablice;

public class Company {
    public static void main(String[] args) {
        //shift f6 zmiana nazwy klasy
        Employee employee=new Employee("Jan","brązowy", 30);
        System.out.printf("%s ma %s kolor oczu i ma %d lat", employee.getName(), employee.getColor(), employee.getAge());
    }
}
