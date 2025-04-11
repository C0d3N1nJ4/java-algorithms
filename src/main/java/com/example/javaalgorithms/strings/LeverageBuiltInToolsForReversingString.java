package com.example.javaalgorithms.strings;

public class LeverageBuiltInToolsForReversingString {

  public static String reverse(String s) {
    if (s == null || s.isEmpty()) {
      return s;
    }
    StringBuilder reversed = new StringBuilder();

    for (int i = s.length() - 1; i >= 0; i--) {
      reversed.append(s.charAt(i));
    }

    return reversed.toString();
  }

  public static String reverse2(String s) {
    if (s == null || s.isEmpty()) {
      return s;
    }
    StringBuilder stringBuilder = new StringBuilder(s);
    return stringBuilder.reverse().toString();
  }

  public static void main(String[] args) {
    System.out.println(reverse2("Hello"));
    System.out.println(reverse2("Naiomi"));
  }
}
