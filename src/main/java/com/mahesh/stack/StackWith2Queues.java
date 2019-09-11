package com.mahesh.stack;


/*
Author: Mahesh Punugupati
*/


import java.util.LinkedList;
import java.util.Queue;

public class StackWith2Queues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int a){
        if(q1.isEmpty()) {
            q1.add(a);
            return;
        }
        q2.addAll(q1);
//        q1.remove()?
        q1.add(a);
        q1.addAll(q2);
    }
    public static void main(String ar[]){
        StackWith2Queues stackWith2Queues = new StackWith2Queues();
        stackWith2Queues.push(1);
        stackWith2Queues.push(2);
    }
}
