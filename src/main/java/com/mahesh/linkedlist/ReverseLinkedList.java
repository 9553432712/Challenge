package com.mahesh.linkedlist;


/*
Author: Mahesh Punugupati
*/


public class ReverseLinkedList {
    public LinkedList.Node reverse(LinkedList.Node current){
        LinkedList.Node previous = null;
        LinkedList.Node nextNode;
        while (current!=null){
            nextNode = current.next;
            current.next = previous;

            previous = current;
            current = nextNode;
        }
        return previous;
    }
    public void print(LinkedList.Node root){
        LinkedList.Node temp = root;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String srg[]){
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        LinkedList.Node newRoot = reverseLinkedList.reverse(linkedList.root);
        reverseLinkedList.print(newRoot);
    }
}
