//Delete a loop in a Linked List.

package com.hotwax;

public class DeleteLoop {

    static class Node
    {
        int data;
        Node next;

    };
        public static Node push(Node head, int data)
        {
            Node node = new Node();
            node.data = data;
            node.next = head;
            return node;
        }

        // Utility function to print a linked list
        public static void printList(Node head)
        {
            Node curr = head;
            while (curr != null)
            {
                System.out.print(curr.data + " —> ");
                curr = curr.next;
            }
            System.out.println("null");
        }
        public static void removeCycle(Node slow, Node head)
        {
            for (Node curr = head; curr != null; curr = curr.next)
            {
                Node ptr = slow;

                while (ptr.next != slow && ptr.next != curr) {
                    ptr = ptr.next;
                }
                if (ptr.next == curr)
                {
                    ptr.next = null;
                    return;
                }
            }
        }

        public static Node identifyCycle(Node head)
        {
            Node slow = head, fast = head;

            while (fast != null && fast.next != null)
            {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    return slow;
                }
            }
            return null;
        }

        public static void main(String[] args)
        {
            int n = 5;
            Node head = null;
            for (int i = n; i > 0; i--) {
                head = push(head, i);
            }
            head.next.next.next.next.next = head.next;
            Node slow = identifyCycle(head);

            if (slow != null)
            {
                removeCycle(slow, head);
                printList(head);
            }
            else {
                System.out.println("No Cycle Found");
            }
        }
    }

