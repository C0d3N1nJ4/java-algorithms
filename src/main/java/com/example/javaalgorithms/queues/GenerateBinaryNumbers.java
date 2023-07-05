package com.example.javaalgorithms.queues;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {

    public static void main(String[] args) {
        generateBinaryNumbers(10);
        printBinary(10);
    }

    private static void generateBinaryNumbers(int i) {
        if (i < 0) {
            System.out.println();
            return;
        }
        Queue queue = new LinkedList();
        queue.add("1");
        for (int j = 0; j < i; j++) {
            int current = Integer.parseInt((String) queue.remove());
            System.out.println(current + " ");
            String s1 = current + "0";
            String s2 = current + "1";
            queue.add(s1);
            queue.add(s2);

        }

    }

    private static void printBinary(int n) {
        if (n < 1) {
            System.out.println();
            return;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        for (int i = 0; i < n; i++) {
            int current = queue.remove();
            System.out.println(current + " ");
            queue.add(current * 10);
            queue.add(current * 10 + 1);


        }
    }


}
