package com.example.javaalgorithms.arrays;

public class PascalTriangle {

        public static int[] triangleRow(int n) {

            if (n == 0) {
                return new int[]{1};
            }

            int[] previous = triangleRow(n - 1);
            int[] current = new int[n + 1];

            current[0] = 1;
            current[n] = 1;

            for (int i = 1; i < n; i++) {
                current[i] = previous[i - 1] + previous[i];
            }
            return current;
        }

        public static void main(String[] args) {

            int[] row0 = triangleRow(0);
            System.out.println("Row 0: " + java.util.Arrays.toString(row0)); // Expected output: [1]

            int[] row4 = triangleRow(4);
            System.out.println("Row 4: " + java.util.Arrays.toString(row4)); // Expected output: [1, 4, 6, 4, 1]

//            int[] row5 = triangleRow(-5);
//            System.out.println("Row 5: " + java.util.Arrays.toString(row5)); //StackOverflowError

            int[] row100 = triangleRow(100);
            System.out.println("Row 100: " + java.util.Arrays.toString(row100)); // Use BigInteger to handle large numbers
        }
    }

