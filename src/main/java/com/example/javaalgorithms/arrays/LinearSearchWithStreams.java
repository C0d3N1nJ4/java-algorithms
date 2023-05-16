package com.example.javaalgorithms.arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class LinearSearchWithStreams {

    public static OptionalInt streamSearch(int[] arr, int item) {
        return Arrays.stream(arr).filter(x -> x == item).findFirst();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(streamSearch(arr, 3));
        streamSearch(arr, 8).ifPresent(System.out::println);
    }
}
