package com.example.javaalgorithms.arrays;

/**
 * Valid Anagram Given two strings s and t, return true if the two strings are anagrams of each
 * other, otherwise return false.
 *
 * <p>An anagram is a string that contains the exact same characters as another string, but the
 * order of the characters can be different.
 *
 * <p>Example 1: Input: s = "racecar", t = "carrace" Output: true
 *
 * <p>Example 2: Input: s = "jar", t = "jam" Output: false
 *
 * <p>Constraints: s and t consist of lowercase English letters.
 */
public class ValidAnagram {

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    int[] count = new int[26];

    for (int i = 0; i < s.length(); i++) {
      count[s.charAt(i) - 'a']++;
      count[t.charAt(i) - 'a']--;
    }

    for (int c : count) {
      if (c != 0) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    ValidAnagram validAnagram = new ValidAnagram();
    String s1 = "racecar";
    String t1 = "carrace";
    System.out.println(validAnagram.isAnagram(s1, t1)); // Output: true

    String s2 = "jar";
    String t2 = "jam";
    System.out.println(validAnagram.isAnagram(s2, t2)); // Output: false
  }
}
