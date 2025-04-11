package com.example.javaalgorithms.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {

  /**
   * Given an integer array nums and an integer k, return true if there are two distinct indices i
   * and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
   *
   * <p>Example 1:
   *
   * <p>Input: nums = [1,2,3,1], k = 3 Output: true Example 2:
   *
   * <p>Input: nums = [1,0,1,1], k = 1 Output: true Example 3:
   *
   * <p>Input: nums = [1,2,3,1,2,3], k = 2 Output: false
   *
   * <p>Constraints:
   *
   * <p>1 <= nums.length <= 105 -109 <= nums[i] <= 109 0 <= k <= 105
   */
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    if (nums == null || nums.length < 2 || k <= 0) {
      return false;
    }

    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        int j = map.get(nums[i]);
        if (i - j <= k) {
          return true;
        }
      }
      map.put(nums[i], i);
    }

    return false;
  }

  public static void main(String[] args) {
    FindDuplicate findDuplicate = new FindDuplicate();
    int[] nums = {1, 2, 3, 1};
    int k = 3;
    boolean result = findDuplicate.containsNearbyDuplicate(nums, k);
    System.out.println(result); // Output: true
  }
}
