package com.example.javaalgorithms.strings;

public class ReverseEachWordInString {
  public static String reverseEachWord(String s) {
    if (s == null || s.isEmpty()) {
      return s;
    }
    StringBuilder result = new StringBuilder();
    String[] array = s.split(" ");

    for (int i = 0; i < array.length; i++) {
      result.append(reverse(array[i]));
      if (i != array.length - 1) {
        result.append(" ");
      }
    }
    return result.toString();
  }

  public static String reverse(String s) {
    return new StringBuilder(s).reverse().toString();
  }

  public static void main(String[] args) {
    System.out.println(reverseEachWord("I love coding"));
  }
}
