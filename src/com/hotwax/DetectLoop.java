//Detect a loop in a Linked List

package com.hotwax;

public class DetectLoop {
    static class Node
    {
        int data;
        Node next;
        int flag;
    };

    static Node push(Node head, int data)
    {
        Node node = new Node();

        node.data = data;
        node.flag = 0;
        node.next = head;
        head = node;
        return head;
    }

    static boolean detectLoop(Node h)
    {
        while (h != null)
        {

            if (h.flag == 1)
                return true;

            h.flag = 1;
            h = h.next;
        }
        return false;
    }

    // Driver code
    public static void main(String[] args)
    {
        Node head = null;

        head = push(head, 20);
        head = push(head, 4);
        head = push(head, 15);
        head = push(head, 10);

        // Create a loop for testing
        head.next.next.next.next = head;

        if (detectLoop(head))
            System.out.print("Loop found");
        else
            System.out.print("No Loop");
    }


}
