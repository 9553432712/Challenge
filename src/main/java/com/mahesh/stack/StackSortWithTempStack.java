package com.mahesh.stack;

/*
Author: Mahesh Punugupati
*/

public class StackSortWithTempStack {
    StackWithArray stack = new StackWithArray(5);
    StackWithArray tempStack = new StackWithArray(5);

    public static void main(String arg[]) {
        StackSortWithTempStack stackSortWithTempStack = new StackSortWithTempStack();
        stackSortWithTempStack.insert();
        stackSortWithTempStack.sort();
        stackSortWithTempStack.print();
    }

    public void insert() {
        stack.push(3);
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);
    }

    public void print() {
        tempStack.print();
    }

    /*
    5
    4
     */
    public void sort() {
        while (stack.getTop() != -1) {
            int tempTop = tempStack.top();
            int stackTop = stack.top();
            if (tempTop == -1) {
                tempStack.push(stack.pop());
                continue;
            }
            stackTop = stack.pop();
            while (stackTop < tempStack.top()) {
                stack.push(tempStack.pop());
            }
            tempStack.push(stackTop);
        }
    }

}
