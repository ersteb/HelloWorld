package com.KU.tablice2;

public class Employee2 {

    public static void main(String[] args) {
        Employee emp=new Employee("John", 30,4000,6);
        //^^-to jest obiekt
        System.out.println(emp.paySalary());

        Employee emp1=new Employee("Ziutek", 61,5000,11);
        System.out.println(emp1.paySalary());

    }
}
