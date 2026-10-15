package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        String first = "Mauricio";
        String last = "Rodriguez";
       // formatName(first,last); not needed
        System.out.println(formatName(first,last));


    }
    public static String formatName(String first, String last){
        return (last + ", "+ first);

    }

}