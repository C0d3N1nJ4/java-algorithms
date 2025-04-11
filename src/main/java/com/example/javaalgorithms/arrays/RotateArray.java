package com.example.javaalgorithms.arrays;

import java.util.Arrays;

public class RotateArray {

  int[] rotateArrayToTheLeft(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      int temp = array[i];
      array[i] = array[i + 1];
      array[i + 1] = temp;
    }
    return array;
  }

  int[] rotateArrayToTheRight(int[] array) {
    for (int i = array.length - 1; i > 0; i--) {
      int temp = array[i];
      array[i] = array[i - 1];
      array[i - 1] = temp;
    }
    return array;
  }

  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6};
    RotateArray rotateArray = new RotateArray();
    Arrays.stream(rotateArray.rotateArrayToTheLeft(array)).forEach(System.out::println);
    Arrays.stream(rotateArray.rotateArrayToTheRight(array)).forEach(System.out::println);
  }
}
