//Printing the middle of a LinkedList

class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

  
    // Appending elements to the Linked List
    public static LinkedList insertAtEnd(LinkedList list, int data) {
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
        return list;}

    public static void printMiddle(LinkedList list)
        
    {
        Node slow_ptr = list.head;
        Node fast_ptr = list.head;
         
            while (fast_ptr != null && fast_ptr.next != null)
            {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            System.out.println("The middle element is [" +
                                slow_ptr.data + "] \n");
         
    }

    public static void lengthOfLinkedList(LinkedList list) {
        int count = 0;
        Node current1 = list.head;
        while (current1!= null) {
            current1=current1.next;
            count++;
        }
        System.out.println(count);
    }


    public static void printList(LinkedList list) {
        Node current = list.head;
        System.out.print("The LinkedList is: ");
        while (current.next != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print(current.data);
    }



    


    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = insertAtEnd(list, 1);
        list = insertAtEnd(list, 2);
        list = insertAtEnd(list, 3);
        list = insertAtEnd(list, 4);
        list = insertAtEnd(list, 5);
       
        printList(list);
        System.out.print("\n");
       lengthOfLinkedList(list);
        printMiddle(list);
 
    }
}