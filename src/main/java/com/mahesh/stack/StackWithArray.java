package com.mahesh.stack;


/*
Author: Mahesh Punugupati
*/


public class StackWithArray {
    int stack[];
    int top=-1;
    StackWithArray(){
        stack = new int[10];
    }
    StackWithArray(int size){
        stack = new int[size];
    }
    public void push(int a){
        if(top==stack.length-1){
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = a;
    }
    public int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }
    public void print(){
        System.out.println("-----------");
        for(int i=0;i<=top;i++)
            System.out.print(stack[i]+"\t");
        System.out.println();
    }
    public static void main(String ar[]){
        StackWithArray stackWithArray= new StackWithArray();
        stackWithArray.push(10);
        stackWithArray.push(20);
        stackWithArray.print();
        stackWithArray.pop();
        stackWithArray.print();
        stackWithArray.pop();
        stackWithArray.print();
        stackWithArray.pop();
    }
}
