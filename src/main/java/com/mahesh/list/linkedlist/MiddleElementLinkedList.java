package com.mahesh.list.linkedlist;

import lombok.NoArgsConstructor;

public class MiddleElementLinkedList {
  public static void main(String[] ar){
    LinkedList linkedList= new LinkedList();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);
    linkedList.add(5);

    middle(linkedList.getHead());
  }

  public static void middle(Node node){

    Node slow = node;
    Node fast= node;
    if(node!=null){
      while (fast!=null && fast.next!=null){
        slow= slow.next;
        fast = fast.next.next;
      }
    }
    System.out.println(slow.data);
  }
}
