package com.KU.tablice2;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InnaStrefaCzas {
    public static void main(String[] args) {


        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(availableZoneId);
        }
    }
}
