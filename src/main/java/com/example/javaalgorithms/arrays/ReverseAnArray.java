package com.example.javaalgorithms.arrays;

import java.util.Arrays;

public class ReverseAnArray {

  // Algorithm to reverse an array

  // 1. Create a function that takes an array as an argument
  // 2. Create a variable called start and set it to 0
  // 3. Create a variable called end and set it to the length of the array minus 1
  // 4. Create a while loop that runs while start is less than end
  // 5. Inside the while loop, create a variable called temp and set it to the value of the array at
  // the index of end
  // 6. Inside the while loop, set the value of the array at the index of end to the value of the
  // array at the index of start
  // 7. Inside the while loop, set the value of the array at the index of start to the value of temp
  // 8. Inside the while loop, increment start by 1
  // 9. Inside the while loop, decrement end by 1
  // 10. Return the array

  int[] reverseArray(int[] array) {
    int start = 0;
    int end = array.length - 1;
    while (start < end) {
      Integer temp = array[end];
      array[end] = array[start];
      array[start] = temp;
      start++;
      end--;
    }
    return array;
  }

  public int[] reversalWithAnotherArray(int[] array) {
    int[] reversedArray = new int[array.length];
    int index = 0;
    for (int i = array.length - 1; i >= 0; i--) {
      reversedArray[index] = array[i];
      index++;
    }
    return reversedArray;
  }

  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    ReverseAnArray reverseArray = new ReverseAnArray();
    Arrays.stream(reverseArray.reverseArray(array)).forEach(System.out::println);
    int[] array2 = {10, 9, 8, 7, 6};
    Arrays.stream(reverseArray.reversalWithAnotherArray(array2)).forEach(System.out::print);
  }
}
