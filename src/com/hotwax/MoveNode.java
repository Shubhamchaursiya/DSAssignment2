//Move last element to front in a Linked List.

package com.hotwax;

public class MoveNode {
    static class Node
    {
        int data;
        Node next;

        Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    };
    public static void printList(Node head)
    {
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }

        System.out.println("null");
    }
    public static Node rearrange(Node head)
    {
        if (head == null || head.next == null) {
            return head;
        }

        Node ptr = head;

        while (ptr.next.next != null) {
            ptr = ptr.next;
        }

        ptr.next.next = head;

        head = ptr.next;

        ptr.next= null;

        return head;
    }

    public static void main(String[] args)
    {
        int[] keys = { 1, 2, 3, 4 };

        Node head = null;
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
        System.out.println("Before move the list is:");
        printList(head);
        System.out.println("After move the list is:");
        head = rearrange(head);

        printList(head);
    }
}


