//Find the middle element of a linked list

package com.hotwax;

public class FindMid {

    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
        this.data=data;
        next=null;
        }
    };

    static Node head;

    public static void createList(int data) {

        Node node = new Node(data);

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
    static void printMiddle()
    {
        Node slow_ptr = head;
        Node fast_ptr = head;

        while (fast_ptr != null && fast_ptr.next != null)
        {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }
        System.out.println("The middle element is [" + slow_ptr.data + "] \n");

    }
    public static void main(String[] args) {
        createList(12);
        createList(22);
        createList(33);
        createList(35);
        createList(93);

        printMiddle();
    }
}
