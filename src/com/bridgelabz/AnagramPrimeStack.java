package com.bridgelabz;

import java.util.LinkedList;

public class AnagramPrimeStack {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<Integer>(); // creating a stack using linked list

        for (int i = 2; i < 1000; i++) {
            if (isPrime(i)) { // check if i is prime
                for (int j = i+1; j < 1000; j++) {
                    if (isPrime(j) && isAnagram(i, j)) { // check if j is prime and anagram of i
                        stack.push(i); // push i to the stack
                        break;
                    }
                }
            }
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop()); // pop and print elements from the stack in reverse order
        }
    }

    public static boolean isPrime(int n) { // method to check if a number is prime
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

    public static boolean isAnagram(int n1, int n2) { // method to check if two numbers are anagrams
        String s1 = String.valueOf(n1);
        String s2 = String.valueOf(n2);
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] count = new int[10];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - '0']++;
            count[s2.charAt(i) - '0']--;
        }
        for (int i = 0; i < 10; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
