package com.bridgelabz;

import java.io.IOException;
import java.util.*;
import java.io.*;
class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class UnorderedList<T>{
    Node<T> head;

    public UnorderedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public boolean remove(T data) {
        if (isEmpty()) {
            return false;
        }

        if (head.data.equals(data)) {
            head = head.next;
            return true;
        }

        Node<T> curr = head;
        Node<T> prev = null;
        while (curr != null && !curr.data.equals(data)) {
            prev = curr;
            curr = curr.next;
        }

        if (curr == null) {
            return false;
        }

        prev.next = curr.next;
        return true;
    }

    public boolean contains(T data) {
        Node<T> curr = head;
        while (curr != null) {
            if (curr.data.equals(data)) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public void display() {
        Node<T> curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public void saveToFile(String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        Node<T> curr = head;
        while (curr != null) {
            writer.write(curr.data.toString());
            writer.write("\n");
            curr = curr.next;
        }
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input file name: ");
        String fileName = sc.nextLine();

        UnorderedList<String> list = new UnorderedList<String>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split(" ");
            for (String word : words) {
                list.add(word);
            }
        }
        reader.close();

        System.out.print("Enter word to search: ");
        String searchWord = sc.nextLine();
        if (list.contains(searchWord)) {
            list.remove(searchWord);
            System.out.println(searchWord + " removed from list.");
        } else {
            list.add(searchWord);
            System.out.println(searchWord + " added to list.");
        }

        System.out.print("Enter output file name: ");
        String saveFileName = sc.nextLine();
        list.saveToFile(saveFileName);

        sc.close();

    }

}
