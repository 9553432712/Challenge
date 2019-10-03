package com.mahesh.linkedlist;


/*
Author: Mahesh Punugupati
*/


public class LinkedList {
    Node root = null;

    static class Node {
        int data;
        Node next;
        Node(int a){
            data = a;
            next =null;
        }
    }

    public void add(int a){
        Node node = new Node(a);
        if(root==null){
            root = node;
            return;
        }
        Node temp = root;
        while (temp.next!=null)
            temp=temp.next;
        temp.next = node;
    }
    public void print(){
        if(root==null){
            System.out.println("-----------Empty-------");
            return;
        }
        Node temp = root;
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
        linkedList.print();
    }

}
