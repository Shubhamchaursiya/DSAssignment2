//Count Number of nodes in a LinkedList.

package com.hotwax;

import java.util.Scanner;

class Node {
    int data ;
    Node next ;
}
class LinkedList {
    static Node head;

//*Create the linked list

    public static void createList(int data) {

        Node node = new Node();

        node.data = data;
        node.next = null;
        if (head == null) {

            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }


    }

//* List traversing

    public static void travers() {
        Node node = head;
        int count=1;
        while (node.next != null) {
            System.out.print(node.data + "--->");
            node = node.next;
            count=count+1;
        }
        System.out.println(node.data);
        System.out.println("Number of node is:"+" "+count);
    }

}
public class CountNode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        linkedList.createList(12);
        linkedList.createList(22);
        linkedList.createList(33);

        linkedList.travers();
    }

}
