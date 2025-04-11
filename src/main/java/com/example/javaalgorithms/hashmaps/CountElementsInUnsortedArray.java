package com.example.javaalgorithms.hashmaps;

import java.util.HashMap;

public class CountElementsInUnsortedArray {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 1, 3, 6, 6, 1, 1, 1, 1, 1, 1};
    System.out.println(countElements(arr, 1));
    System.out.println(countElements(arr, 2));
    System.out.println(countElements(arr, 3));
    System.out.println(countElements(arr, 6));
  }

  public static int countElements(int[] arr, int item) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int x : arr) {
      if (map.containsKey(x)) {
        map.put(x, map.get(x) + 1);
      } else {
        map.put(x, 1);
      }
    }
    return map.get(item);
  }
}
