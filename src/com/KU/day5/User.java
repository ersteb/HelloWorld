package com.KU.day5;

import java.time.LocalDate;

public class User {

    private String name;
    private String email;
    private LocalDate birthday;

    public User(String name, String email, LocalDate birthday) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
