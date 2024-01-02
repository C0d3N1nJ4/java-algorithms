package com.example.javaalgorithms.arrays;

public class InterpolationSearch {
    public static int interpolationSearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right && target >= arr[left] && target <= arr[right]) {
            int pos = left + ((target - arr[left]) * (right - left)) / (arr[right] - arr[left]);

            if (arr[pos] == target) {
                return pos; // Element found at index pos
            } else if (arr[pos] < target) {
                left = pos + 1;
            } else {
                right = pos - 1;
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int target = 6;
        int result = interpolationSearch(arr, target);
        System.out.println((result == -1) ? "Element not found" : "Element found at index " + result);
    }
}


