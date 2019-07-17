package com.outsidematrix.lab.example;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class DateTimeExample {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss.SSS");

    public static void main(String[] args){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        System.out.println(timestamp);
        System.out.println(sdf.format(timestamp));
    }
}
