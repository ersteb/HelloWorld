package com.KU.tablice;

public class Employee {

    private String name;
    private String color;
    private int age;


    public Employee(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Employee(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
}
