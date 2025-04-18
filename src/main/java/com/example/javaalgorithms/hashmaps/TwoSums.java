package com.example.javaalgorithms.hashmaps;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */

public class TwoSums {

  public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15}; // 9
    int target = 9;
    int[] result = twoSum(nums, target);
    System.out.println("[" + result[0] + ", " + result[1] + "]");
  }

  public static int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    int i = 0;
    int j = 1;
    while (i < nums.length) {
      if (nums[i] + nums[j] == target) {
        result[0] = i;
        result[1] = j;
        break;
      } else if (j == nums.length - 1) {
        i++;
        j = i + 1;
      } else {
        j++;
      }
    }
    return result;
  }
}
