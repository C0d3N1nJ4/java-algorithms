package com.example.javaalgorithms.arrays;

public class MaxProductFinder {

  public static int findMaxProduct(int[] nums) {
    if (nums == null || nums.length < 2) {
      return Integer.MIN_VALUE;
    }
    // Initialize to the smallest possible integer values.
    int max1 = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;

    for (int num : nums) {
      if (num > max1) {
        max2 = max1;
        max1 = num;
      } else if (num > max2) {
        max2 = num;
      }
    }

    return Math.multiplyExact(max1, max2);
  }

  public static void main(String[] args) {
    // Example 1:
    int[] example1 = {5};
    System.out.println(findMaxProduct(example1)); // -2147483648

    // Example 2:
    int[] example2 = {5, 3, 2, 5, 7, 0, 1};
    System.out.println(findMaxProduct(example2)); // 35

    // Example 3:
    int[] example3 = {-2, -1, -3, 4, -8, 0};
    System.out.println(findMaxProduct(example3)); // 24
  }
}
