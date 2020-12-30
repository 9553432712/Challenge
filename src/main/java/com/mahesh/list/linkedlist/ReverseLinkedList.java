package com.mahesh.list.linkedlist;


/*
Author: Mahesh Punugupati
*/


public class ReverseLinkedList {
    public static void main(String srg[]) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        Node newRoot = reverseLinkedList.reverse(linkedList.getHead());
        reverseLinkedList.print(newRoot);
    }

    public Node reverse(Node current) {
        Node previous = null;
        Node nextNode;
        while (current != null) {
            nextNode = current.next;
            current.next = previous;

            previous = current;
            current = nextNode;
        }
        return previous;
    }

    public void print(Node root) {
        Node temp = root;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
