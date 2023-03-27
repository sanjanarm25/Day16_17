package com.bridgelabz;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PallindromeChecker {
    public static boolean isPalindrome(String str) {
        // Create a deque to store the characters of the string
        Deque<Character> deque = new LinkedList<>();

        // Add each character of the string to the rear of the deque
        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }

        // Process the deque from both ends and check if the characters match
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        if (isPalindrome(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }


    }

