package com.bridgelabz;

import java.util.LinkedList;

public class AnagramQueue {
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean areAnagrams(int num1, int num2) {
        int[] digits1 = new int[10];
        int[] digits2 = new int[10];

        while (num1 > 0) {
            digits1[num1 % 10]++;
            num1 /= 10;
        }

        while (num2 > 0) {
            digits2[num2 % 10]++;
            num2 /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (digits1[i] != digits2[i]) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<Integer>();

        for (int i = 2; i < 1000; i++) {
            if (isPrime(i)) {
                for (int j = i + 1; j < 1000; j++) {
                    if (isPrime(j) && areAnagrams(i, j)) {
                        queue.add(i);
                        queue.add(j);
                    }
                }
            }
        }

        System.out.println("Anagram Queue:");
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
    }

    
}
