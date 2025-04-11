package com.example.javaalgorithms.strings;

public class CustomParsingToSearch {

  public static void main(String[] args) {

    System.out.println(isCharAtEvenIndex("Hello", 'l'));
    System.out.println(isCharAtEvenIndex("Naiomi", 'G'));
    System.out.println(isCharAtEvenIndex("World", 'W'));
    System.out.println(isCharAtEvenIndex(null, 'h'));
    System.out.println(isCharAtEvenIndex("", 't'));
  }

  public static boolean isCharAtEvenIndex(String s, char c) {
    if (s == null || s.isEmpty()) {
      return false;
    }
    for (int i = 0; i < s.length() / 2 + 1; i = i + 2) {
      if (s.charAt(i) == c) {
        return true;
      }
    }
    return false;
  }
}
