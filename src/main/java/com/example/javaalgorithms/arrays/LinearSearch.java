package com.example.javaalgorithms.arrays;

public class LinearSearch {

  public static boolean linearSearchReturnBoolean(int[] arr, int item) {
    for (int current : arr) {
      if (current == item) {
        return true;
      }
    }
    return false;
  }

  // Returning primitive int
  public static int linearSearchReturnInt(int[] arr, int item) {
    for (int current : arr) {
      if (current == item) {
        return item;
      }
    }
    return -1;
  }

  // Integer is an object and can be null
  public static Integer linearSearchReturnInteger(int[] arr, int item) {
    for (int current : arr) {
      if (current == item) {
        return item;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6};
    System.out.println(linearSearchReturnBoolean(arr, 1));
    System.out.println(linearSearchReturnInt(arr, 5));
    System.out.println(linearSearchReturnInteger(arr, 0));
  }
}
