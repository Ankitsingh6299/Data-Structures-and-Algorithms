import java.io.*;
import java.util.*;
class DLL{
    Node head;

    static class Node{
        int data;
        Node tail;
        Node head;

        Node(int d){
            data=d;
            tail=null;
            head=null;
        }
    }

    //Inserting at first position
    public static void push(DLL list,int data){
        Node new_n=new Node(data);
       
           list.head=new_n;
        
    }
}