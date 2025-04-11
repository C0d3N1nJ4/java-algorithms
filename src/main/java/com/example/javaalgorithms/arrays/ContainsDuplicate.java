package com.example.javaalgorithms.arrays;

import java.util.Arrays;

/**
 * Contains Duplicate Given an integer array nums, return true if any value appears more than once
 * in the array, otherwise return false.
 *
 * <p>Example 1: Input: nums = [1, 2, 3, 3] Output: true
 *
 * <p>Example 2: Input: nums = [1, 2, 3, 4] Output: false
 */
public class ContainsDuplicate {

  public boolean hasDuplicate(int[] nums) {
    return Arrays.stream(nums).distinct().count() < nums.length;
  }

  public static void main(String[] args) {
    ContainsDuplicate containsDuplicate = new ContainsDuplicate();
    int[] nums = {1, 2, 3, 1};
    System.out.println(containsDuplicate.hasDuplicate(nums)); // true
    int[] nums2 = {1, 2, 3, 4};
    System.out.println(containsDuplicate.hasDuplicate(nums2)); // false
  }
}
