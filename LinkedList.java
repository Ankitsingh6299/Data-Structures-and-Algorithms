import java.io.*;
import java.util.*;

class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        // Constructor to create a node
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a new Node
    public static LinkedList insert(LinkedList list, int data) {
        Node new_n = new Node(data);
        new_n.next = null;

        if (list.head == null) {
            list.head = new_n;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_n;
        }
        return list;
    }

    // Printing the LinkedList
    public static void printList(LinkedList list) {
        Node curr_node = list.head;
        System.out.println("Linked List: ");
        while (curr_node != null) {
            System.out.print(curr_node.data + " ");
            curr_node = curr_node.next;
        }
    }

    // Main method
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        printList(list);
    }
}