package com.example.javaalgorithms.hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ItemsPresentInArrayOneButNotInArrayTwo {

    public static List<Integer> findMissingElements(int[] first, int[] second) {
        List<Integer> missingElements = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int x : second) {
            set.add(x);
        }
        for (int x : first) {
            if (!set.contains(x)) {
                missingElements.add(x);
            }
        }

        return missingElements;

    }

    public static void main(String[] args) {
        findMissingElements(new int[]{8,0,1,7,3,6}, new int[]{5,7,3,0,5,6,7,8,9}).forEach(System.out::println);
        findMissingElements(new int[]{7,8,3,4,5,6}, new int[]{1,2,3,4,5,6}).forEach(System.out::println);
    }

    }



