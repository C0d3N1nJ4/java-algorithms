package com.example.javaalgorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class AggregateAndFilter {

  public static void main(String[] args) {
    int[] arr1 = {-9, 3, 2, -8, -16};
    int[] arr2 = {0, -3, -8, 5, 2};

    System.out.println("Test FindEvenNumbers method");
    Arrays.stream(findEvenNumbers(arr1, arr2)).forEach(System.out::println);
    System.out.println("Test FindEvenNumbersWithStreams method");
    Arrays.stream(FindEvenNumbersWithStreams(arr1, arr2)).forEach(System.out::println);
  }

  private static int[] findEvenNumbers(int[] arr1, int[] arr2) {
    ArrayList<Integer> result = new ArrayList<>();

    for (int num : arr1) {
      if (num % 2 == 0) {
        result.add(num);
      }
    }

    for (int num : arr2) {
      if (num % 2 == 0) {
        result.add(num);
      }
    }

    return result.stream().mapToInt(i -> i).toArray();
  }

  public static int[] FindEvenNumbersWithStreams(int[] arr1, int[] arr2) {
    IntPredicate isEven = num -> num % 2 == 0;
    return Stream.of(arr1, arr2).flatMapToInt(Arrays::stream).filter(isEven).toArray();
  }
}
