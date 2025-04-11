package com.example.javaalgorithms.arrays;

import java.util.Arrays;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two
 * integers m and n, representing the number of elements in nums1 and nums2 respectively.
 *
 * <p>Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * <p>The final sorted array should not be returned by the function, but instead be stored inside
 * the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements
 * denote the elements that should be merged, and the last n elements are set to 0 and should be
 * ignored. nums2 has a length of n.
 *
 * <p>Example 1:
 *
 * <p>Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 Output: [1,2,2,3,5,6] Explanation:
 * The arrays we are merging are [1,2,3] and [2,5,6]. The result of the merge is [1,2,2,3,5,6] with
 * the underlined elements coming from nums1. Example 2:
 *
 * <p>Input: nums1 = [1], m = 1, nums2 = [], n = 0 Output: [1] Explanation: The arrays we are
 * merging are [1] and []. The result of the merge is [1]. Example 3:
 *
 * <p>Input: nums1 = [0], m = 0, nums2 = [1], n = 1 Output: [1] Explanation: The arrays we are
 * merging are [] and [1]. The result of the merge is [1]. Note that because m = 0, there are no
 * elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 *
 * <p>Constraints:
 *
 * <p>nums1.length == m + n nums2.length == n 0 <= m, n <= 200 1 <= m + n <= 200 -109 <= nums1[i],
 * nums2[j] <= 109
 *
 * <p>Follow up: Can you come up with an algorithm that runs in O(m + n) time?
 */
public class MergeSortedArray {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int p1 = m - 1; // pointer for nums1's last valid element
    int p2 = n - 1; // pointer for nums2's last element
    int p = m + n - 1; // pointer for nums1's last total element

    while (p1 >= 0 && p2 >= 0) {
      if (nums1[p1] > nums2[p2]) {
        nums1[p] = nums1[p1];
        p1--;
      } else {
        nums1[p] = nums2[p2];
        p2--;
      }
      p--;
    }

    // Copy remaining elements from nums2, if any
    while (p2 >= 0) {
      nums1[p] = nums2[p2];
      p2--;
      p--;
    }
  }

  public static void main(String[] args) {
    MergeSortedArray merger = new MergeSortedArray();

    // Example 1
    int[] nums1a = {1, 2, 3, 0, 0, 0};
    int[] nums2a = {2, 5, 6};
    merger.merge(nums1a, 3, nums2a, 3);
    System.out.println("Example 1: " + Arrays.toString(nums1a)); // [1, 2, 2, 3, 5, 6]

    // Example 2
    int[] nums1b = {1};
    int[] nums2b = {};
    merger.merge(nums1b, 1, nums2b, 0);
    System.out.println("Example 2: " + Arrays.toString(nums1b)); // [1]

    // Example 3
    int[] nums1c = {0};
    int[] nums2c = {1};
    merger.merge(nums1c, 0, nums2c, 1);
    System.out.println("Example 3: " + Arrays.toString(nums1c)); // [1]
  }
}
