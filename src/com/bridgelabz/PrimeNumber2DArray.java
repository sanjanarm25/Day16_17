package com.bridgelabz;

public class PrimeNumber2DArray {
    public static void main(String[] args) {
            int[][] primeArray = new int[10][];
            int count = 0;
            for(int i = 0; i < 1000; i+=100) {
                int[] tempArray = new int[25];
                int index = 0;
                for(int j = i; j < i+100; j++) {
                    if(isPrime(j)) {
                        tempArray[index++] = j;
                        count++;
                    }
                }
                primeArray[i/100] = new int[index];
                System.arraycopy(tempArray, 0, primeArray[i/100], 0, index);
            }
            System.out.println("Total prime numbers found: " + count);
            System.out.println("Prime numbers in 2D array:");
            for(int i = 0; i < 10; i++) {
                for(int j = 0; j < primeArray[i].length; j++) {
                    System.out.print(primeArray[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static boolean isPrime(int n) {
            if(n <= 1) {
                return false;
            }
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n%i == 0) {
                    return false;
                }
            }
            return true;
        }



}
