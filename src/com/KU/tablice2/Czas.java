package com.KU.tablice2;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
/*
public class Czas {
    private int hours;
    private int minutes;

    public Czas(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Czas(String time) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("HH 'h' mm 'min'"); // 01 h 05 min
        LocalTime theTime = LocalTime.parse(time, pattern);
        this.hours = theTime.getHour();
        this.minutes = theTime.getMinute();
    }

    public Czas add(Czas t) {
        int hours = this.hours + t.hours;
        int minutes = this.minutes + t.minutes; // Może byc więcej niż 60!
        hours = hours + minutes / 60; // Dzielimy przez 60, żeby dostać pełne godziny
        minutes = minutes % 60; // reszta da nam odpowienią ilość minut
        return new Czas(hours, minutes);
    }

    public Czas sub(Czas t) {
        int hours = this.hours - t.hours;
        int minutes = this.minutes - t.minutes; // Może byc mniej niż 0!
        hours = hours - (60 - minutes) / 60; // Dzielimy przez 60, żeby dostać pełne godziny
        minutes = 60 - Math.abs(minutes % 60); // abs to wartość bezwględna - zawsze dodatnia
        return new Czas(hours, minutes);
    }

    public Czas multiply(int times) {
        Czas result = new Czas(this.hours, this.minutes);
        for (int i = 0; i < times; i++) {
            result = result.add(this);
        }
        return result;
    }

    @Override
    public String toString() {
        return this.hours + " h " + this.minutes + " min";
    }
}
*/