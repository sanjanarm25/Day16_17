package com.bridgelabz;

public class PrimeNumbers {
    public static void main(String[] args) {
        int i, j;
        boolean isPrime;

        // Loop through all numbers from 0 to 1000
        for (i = 0; i <= 1000; i++) {
            // Skip 0 and 1 since they are not prime
            if (i == 0 || i == 1) {
                continue;
            }

            // Check if i is prime by checking if it is divisible by any number between 2 and i-1
            isPrime = true;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If i is prime, print it out
            if (isPrime) {
                System.out.println(i);
            }
        }
    }

}
