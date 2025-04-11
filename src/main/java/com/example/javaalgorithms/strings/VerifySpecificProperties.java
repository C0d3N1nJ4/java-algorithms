package com.example.javaalgorithms.strings;

public class VerifySpecificProperties {

  public static boolean isPasswordComplex(String s) {
    return s.chars().anyMatch(Character::isUpperCase)
        && s.chars().anyMatch(Character::isLowerCase)
        && s.chars().anyMatch(Character::isDigit);
  }

  public static void main(String[] args) {
    System.out.println(isPasswordComplex("hsyT826374!"));
    System.out.println(isPasswordComplex("hello"));
  }
}
