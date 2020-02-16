package com.KU.tablice2;

public class Employee {
    private String name;
    private int age;
    private int salary;
    private int seniority;

    public Employee (String name, int age, int salary, int seniority) {
        //^^- to jest konstruktor z argumentami
        //w konstruktorze znajdują się operacje wykonywane w trakcie inicjalizowania obiektu
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.seniority = seniority;
    }

    public float paySalary() { //<-- tu mamy metodę
        float result = this.salary;
        if (seniority > 15) {
            result += this.salary * 0.15;
        }
        else if (seniority > 10) {
            result += this.salary * 0.1;
        }
        else if (seniority > 5) {
            result += this.salary * 0.05;
        }
        if (age > 60) {
            result += this.salary * 0.1;
        }
        else if (age > 50) {
            result += this.salary * 0.05;
        }

        return result;
    }
}
