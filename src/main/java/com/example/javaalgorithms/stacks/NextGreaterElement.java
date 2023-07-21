package com.example.javaalgorithms.stacks;

import java.util.Stack;

public class NextGreaterElement {

    public static void printNextGreaterElement(int[] arr) {
        if (arr.length == 0) {
            return;
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int next = arr[i];

            if (!stack.isEmpty()) {
               int popped = stack.pop();
               if (popped < next) {
                    System.out.println(popped + " --> " + next);
               }
            }
            stack.push(next);
        }

    }

    public static void main(String[] args) {
        printNextGreaterElement(new int[]{1,20,3,14,5});
        printNextGreaterElement(new int[]{1,0,3,2,5});
    }
}
