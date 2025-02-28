package com.example.javaalgorithms.strings;

public class VerifyAllOrNothingProperties {

    //Validate all-or-nothing properties
    public static boolean isUpperCase(String s) {
        return s.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isLowerCase(String s) {
        return s.chars().allMatch(Character::isLowerCase);
    }

    public static boolean isDigit(String s) {
        return s.chars().allMatch(Character::isDigit);
    }

    public static void main(String[] args) {
        System.out.println(isUpperCase("Hello"));
        System.out.println(isLowerCase("hello"));
        System.out.println(isDigit("H3110"));
        System.out.println(isDigit("192837465"));
    }
}
