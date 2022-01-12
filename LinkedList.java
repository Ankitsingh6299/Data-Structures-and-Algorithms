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

    // Inserting at beginning
    public static LinkedList insertAtStart(LinkedList list, int data) {
        Node new_node = new Node(data);
        new_node.next = list.head;
        list.head = new_node;
        return list;

    }

    // Deletion of first Node
    public static LinkedList deleteFirst(LinkedList list) {
        Node curr = list.head;
        list.head = list.head.next;
        curr.next = null;
        return list;
    }

    // inserting at particular position

    public static LinkedList insertAt(LinkedList list, int n, int data) {
        Node new_node = new Node(data);
        Node previous = list.head;
        int count = 1;
        while (count < n - 1) {
            previous = previous.next;
            count++;
        }
        Node current = previous.next;
        new_node.next = current;
        previous.next = new_node;
        return list;

    }

    {

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
        list = insertAtStart(list, 0);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
        list = insertAt(list, 4, 13);
        list = deleteFirst(list);
        printList(list);
    }
}