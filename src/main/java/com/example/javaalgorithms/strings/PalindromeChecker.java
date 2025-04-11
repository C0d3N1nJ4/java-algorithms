package com.example.javaalgorithms.strings;

import java.util.stream.IntStream;

public class PalindromeChecker {

  public static void main(String[] args) {
    System.out.println(checker("Madam"));
    System.out.println(checker("CivIc"));
    System.out.println(checker("wifi"));
    System.out.println(checker("together"));
  }

  static boolean checker(String original) {

    String cleanedString = original.replaceAll("^a-zA-Z0-9", "").toLowerCase();

    return IntStream.range(0, cleanedString.length() / 2)
        .allMatch(
            i -> cleanedString.charAt(i) == cleanedString.charAt(cleanedString.length() - 1 - i));
  }
}
