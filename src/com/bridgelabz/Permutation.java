package com.bridgelabz;
import java.util.ArrayList;
import java.util.Arrays;




public class Permutation {

    // Iterative method to generate all permutations of a string
    public static String[] generatePermutationsIterative(String str) {
        ArrayList<String> permutations = new ArrayList<String>();
        permutations.add(String.valueOf(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int size = permutations.size();
            for (int j = 0; j < size; j++) {
                String permutation = permutations.remove(0);
                for (int k = 0; k <= permutation.length(); k++) {
                    permutations.add(permutation.substring(0, k) + currentChar + permutation.substring(k));
                }
            }
        }
        String[] result = new String[permutations.size()];
        return permutations.toArray(result);
    }

    // Recursive method to generate all permutations of a string
    public static String[] generatePermutationsRecursive(String str) {
        if (str == null || str.length() == 0) {
            return new String[0];
        }
        if (str.length() == 1) {
            return new String[] { str };
        }
        ArrayList<String> permutations = new ArrayList<String>();
        char firstChar = str.charAt(0);
        String[] subPermutations = generatePermutationsRecursive(str.substring(1));
        for (String subPermutation : subPermutations) {
            for (int i = 0; i <= subPermutation.length(); i++) {
                String permutation = subPermutation.substring(0, i) + firstChar + subPermutation.substring(i);
                permutations.add(permutation);
            }
        }
        String[] result = new String[permutations.size()];
        return permutations.toArray(result);
    }


    public static void main(String[] args) {
        String str = "abc";
        String[] permutationsIterative = generatePermutationsIterative(str);
        String[] permutationsRecursive = generatePermutationsRecursive(str);
        Arrays.sort(permutationsIterative);
        Arrays.sort(permutationsRecursive);
        if (Arrays.equals(permutationsIterative, permutationsRecursive)) {
            System.out.println("Both methods generate the same permutations: " + Arrays.toString(permutationsIterative));
        }
        else {
            System.out.println("The two methods generate different permutations.");
        }
    }
}
