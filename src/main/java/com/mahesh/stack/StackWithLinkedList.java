package com.mahesh.stack;


/*
Author: Mahesh Punugupati
*/


public class StackWithLinkedList {
    Node top=null;
    Node root;
    static class Node{
        int data;
        Node next;
        Node(int i){
            data = i;
            next = null;
        }
    }
    public void push(int i){
        top = new Node(i);
        if(root==null) {
            root = top;
            return;
        }
        Node t = root;
        while (t.next!=null){
            t = t.next;
        }
        t.next=top;
    }
    public int pop(){
        if(top==null){
            System.out.println("stack is empty");
            return -1;
        }
        int result = top.data;
        if (root==top){
            root = top = null;
            return result;
        }
        Node temp = root;
        while (temp.next!=top)
            temp = temp.next;
        top = temp;
        top.next=null;
        return result;
    }
    public void print(){
        Node temp = root;
        System.out.println("------------");
        while (temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String ar[]){
        StackWithLinkedList stackWithLinkedList = new StackWithLinkedList();
        stackWithLinkedList.print();
        stackWithLinkedList.push(1);
        stackWithLinkedList.print();
        stackWithLinkedList.pop();
        stackWithLinkedList.print();
    }
}
