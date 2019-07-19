package com.outsidematrix.lab;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.zip.DataFormatException;

public class Temporary {
    public static void main(String[] args){
        String a = "aaa";
        String b = "bbb";
        String c = "ccc";

        List<String> l = new ArrayList<>();
        l.add(a);
        l.add(b);
        l.add(c);
        System.out.println(String.join(";", l));

        l.add(null);
        l.add(c);
        System.out.println(String.join(";", l));

        l.clear();
        System.out.println(String.join(";", l));

        for(String s: l){
            s
        }


    }
}
