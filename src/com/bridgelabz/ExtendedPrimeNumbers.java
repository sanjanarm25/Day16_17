package com.bridgelabz;
import java.util.*;
public class ExtendedPrimeNumbers {
    public static boolean isPrime(int n) {
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

    public static boolean isPalindrome(int n) {
        String str = Integer.toString(n);
        String reversed = new StringBuilder(str).reverse().toString();

        return str.equals(reversed);
    }

    public static boolean isAnagram(int n, List<Integer> primes) {
        String str1 = Integer.toString(n);
        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr1);

        for (int prime : primes) {
            if (prime == n) {
                continue;
            }

            String str2 = Integer.toString(prime);
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                return true;
            }
        }

        return false;

}
    public static void main(String[] args) {
        int start = 0, end = 1000;
        List<Integer> primes = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        System.out.println("Prime numbers between " + start + " and " + end + ": ");
        System.out.println(primes);

        List<Integer> palindromes = new ArrayList<>();
        List<Integer> anagrams = new ArrayList<>();

        for (int i : primes) {
            if (isPalindrome(i)) {
                palindromes.add(i);
            }

            if (isAnagram(i, primes)) {
                anagrams.add(i);
            }
        }

        System.out.println("Palindrome primes: ");
        System.out.println(palindromes);

        System.out.println("Anagram primes: ");
        System.out.println(anagrams);
    }

}


