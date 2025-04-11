package com.example.javaalgorithms.stacks;

import java.util.Stack;

public class MatchingParentheses {

  public static boolean hasMatchingParentheses(String str) {
    Stack<Character> stack = new Stack<>();
    for (char c : str.toCharArray()) {
      if (c == '(') {
        stack.push(c);
      } else if (c == ')') {
        if (stack.isEmpty()) {
          return false;
        }
        stack.pop();
      }
    }
    return stack.isEmpty();
  }

  public static void main(String[] args) {
    System.out.println(hasMatchingParentheses("((()))")); // true
    System.out.println(hasMatchingParentheses("")); // true
    System.out.println(hasMatchingParentheses("()")); // true
    System.out.println(hasMatchingParentheses("((algorithm)))")); // false
    System.out.println(hasMatchingParentheses("((())")); // false
    System.out.println(hasMatchingParentheses("((()))))")); // false
  }
}
