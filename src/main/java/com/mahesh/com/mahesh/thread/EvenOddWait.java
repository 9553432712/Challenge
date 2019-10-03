package com.mahesh.com.mahesh.thread;
/*
Author: Mahesh Punugupati
*/

class EvenOdd extends Thread{
    @Override
    public void run(){
        try {
            printEven();
            printOdd();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void printOdd() throws InterruptedException {
        synchronized(this) {
            for (int i = 1; i < 10; i=i+2) {
                //sleep(10);
                if (i % 2 == 1 && this.getName().equals("odd")) {
                    System.out.println(i);
                    this.setName("even");
                    notify();
                    wait();
                }
            }
        }
    }
    private void printEven() throws InterruptedException {
        synchronized(this)
        {
            for (int i = 0; i < 10; i=i+2) {
                if (i % 2 == 0 && this.getName().equals("even")) {
                    System.out.println(i);
                    this.setName("odd");
                    wait();
                    notify();
                }
            }
        }
    }
}

public class EvenOddWait {
    public static void main(String arg[]){
        EvenOdd evenOdd = new EvenOdd();
        evenOdd.setName("even");
        evenOdd.start();
    }
}