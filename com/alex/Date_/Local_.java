package com.alex.Date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
 * @author Alex
 * @version 1.0
 */

public class Local_ {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        LocalDateTime localDateTime = ldt.plusDays(2);
        System.out.println(localDateTime);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String format = dtf.format(localDateTime);
        System.out.println(format);
    }
}
