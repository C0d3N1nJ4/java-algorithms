package com.example.javaalgorithms.arrays;

/**
 * Implement a function that finds the product of two numbers in an unsorted array. The function will take one input, an array containing integers,
 * and it will output the product the maximum product of two numbers in the array.
 */

public class Answer {

    static int maxProductOfTwoNumbers(int[] numbers) {
        int maxNumber = 0;
        int secondMaxNumber = 0;

        for (int number : numbers) {
            if (number > maxNumber) {
                secondMaxNumber = maxNumber;
                maxNumber = number;
            } else if (number > secondMaxNumber) {
                secondMaxNumber = number;
            }
        }

        return maxNumber * secondMaxNumber;
    }

    public static void main(String[] args) {
        int[] numbers = { 7, 17, 13, 19, 5 };
        int result = Answer.maxProductOfTwoNumbers(numbers);
        System.out.println(result);
    }
}
