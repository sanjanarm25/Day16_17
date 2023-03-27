package com.bridgelabz;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BankingCashCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        int cashBalance = 10000; // Starting cash balance

        while (true) {
            System.out.println("Enter your choice: ");
            System.out.println("1. Add a person to the queue");
            System.out.println("2. Dequeue the next person");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter person name: ");
                    String name = sc.next();
                    System.out.println("Enter transaction type (D/W): ");
                    String type = sc.next();
                    queue.add(name + "-" + type);
                    break;
                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty");
                        break;
                    }

                    String person = queue.remove();
                    String[] details = person.split("-");
                    String personName = details[0];
                    String transactionType = details[1];

                    System.out.println("Processing transaction for " + personName);
                    int amount;
                    if (transactionType.equalsIgnoreCase("D")) {
                        System.out.println("Enter deposit amount: ");
                        amount = sc.nextInt();
                        cashBalance += amount;
                        System.out.println("Cash deposited successfully. New balance: " + cashBalance);
                    } else {
                        System.out.println("Enter withdrawal amount: ");
                        amount = sc.nextInt();
                        if (amount > cashBalance) {
                            System.out.println("Insufficient balance");
                            break;
                        }
                        cashBalance -= amount;
                        System.out.println("Cash withdrawn successfully. New balance: " + cashBalance);
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    
}
