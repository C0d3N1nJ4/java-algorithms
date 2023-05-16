package com.example.javaalgorithms.strings;

public class NormalizeString {

    public static String normalizeString(String s) {
        return s.toLowerCase().trim().replace(",", "");
    }

    public static void main(String[] args) {
        System.out.println(normalizeString(" T rsf YNSP,2 3"));
    }

}
