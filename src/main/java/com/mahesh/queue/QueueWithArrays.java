package com.mahesh.queue;

/*
Author: Mahesh Punugupati
*/


public class QueueWithArrays {
    int front;
    int rear;
    int capacity;
    int size;
    int queue[];


    QueueWithArrays(){
        capacity = 10;
        front = 0;
        rear = capacity-1;
        queue = new int[capacity];
    }
    QueueWithArrays(int size){
        capacity = size;
        front = 0;
        rear = capacity-1;
        queue = new int[capacity];
    }
    public void enqueue(int a){
        if(size==capacity){
            System.out.println("Queue is full");
            return;
        }
        rear = (rear+1)%capacity;
        queue[rear] = a;
        size++;
    }
    public void dequeue(){
        if(size==0){
            System.out.println("Queue is empty");
            return;
        }
        front = (front+1)%capacity;
        size--;
    }
    public void print(){
        int temp=0;
        System.out.println("----------------------");
        if(size==0)
            return;
        if(front<rear) {
            for (int i = front; i <= rear && temp<size ; i++, temp++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i=front;i<capacity && temp<size;i++, temp++)
            System.out.print(queue[i]+" ");
        for(int i=0;i<=rear && temp<size;i++, temp++)
            System.out.print(queue[i]+" ");
        System.out.println();

    }
    public static void main(String ar[]){
        QueueWithArrays queueWithArrays = new QueueWithArrays(3);
        queueWithArrays.enqueue(1);
        queueWithArrays.enqueue(1);
        queueWithArrays.enqueue(1);
        queueWithArrays.print();
        queueWithArrays.dequeue();
        queueWithArrays.dequeue();
        queueWithArrays.print();
        queueWithArrays.enqueue(1);
        queueWithArrays.print();
    }
}
