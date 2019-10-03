package com.mahesh.stack;


/*
Author: Mahesh Punugupati
*/

import com.mahesh.queue.QueueWithArrays;

public class StackWith2Queues {
    QueueWithArrays q1 = new QueueWithArrays();
    QueueWithArrays q2 = new QueueWithArrays();

    public static void main(String[] ar) {
        StackWith2Queues stackWith2Queues = new StackWith2Queues();
        stackWith2Queues.pop();
        stackWith2Queues.push(1);
        stackWith2Queues.push(2);
        stackWith2Queues.push(3);


    }

    public void push(int a) {
        if (q1.getSize() == 0) {
            q1.enqueue(a);
            return;
        }
        while (q1.getSize() != 0)
            q2.enqueue(q1.dequeue());
        q1.enqueue(a);
        while (q2.getSize() != 0)
            q1.enqueue(q2.dequeue());
    }

    public int pop() {
        if (q1.getSize() == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return q1.dequeue();
    }
}
