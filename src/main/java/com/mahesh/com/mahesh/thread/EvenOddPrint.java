package com.mahesh.com.mahesh.thread;
/*
Author: Mahesh Punugupati
*/

class Odd extends Thread{
    @Override
    public void run(){
        try {
            printOdd();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void printOdd() throws InterruptedException {
        synchronized(this) {
            for (int i = 1; i < 10; i=i+2) {
                sleep(10);
                if (i % 2 == 1)
                    System.out.println(i);
                notify();
            }
        }
    }
}
class Even extends Thread{
    @Override
    public void run(){
        try {
            printEven();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void printEven() throws InterruptedException {
        synchronized(this)
        {
            for (int i = 0; i < 10; i=i+2) {
                if (i % 2 == 0)
                    System.out.println(i);
                notify();
                sleep(10);
            }
        }
    }
}
public class EvenOddPrint {
    public static void main(String arg[]){
        Even even = new Even();
        even.setName("even");
        Odd odd = new Odd();
        odd.setName("odd");
        even.start();
        odd.start();
    }
}