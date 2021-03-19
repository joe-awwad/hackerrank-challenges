package com.joeaouad.hackerrank.easy;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConversion {

    static String timeConversion(String s) {
        return LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa"))
                .format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}
