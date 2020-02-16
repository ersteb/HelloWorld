package com.KU.tablice2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataCzas {
    public static void main(String[] args) throws ParseException {
        //Date date = new Date();
        //System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");
        Date date = sdf.parse("1987/11/25");
        System.out.println("1987/11/25");
        System.out.println(sdf2.format(new Date()));
    }

}
