package com.mahesh.algorithm;


/*
Author: Mahesh Punugupati
*/


public class UglyNumber {
    public static void main(String arg[]){
        int n=56;
        System.out.println("ugly number"+checkUgly(n));
    }
    public static boolean checkUgly(int n){
        if(n==1){
            return true;
        }
        if(n%2==0){
            return checkUgly(n/2);
        }else if(n%3==0){
            return checkUgly(n/3);
        }else if(n%5==0){
            return checkUgly(n/5);
        }
        else {
            return false;
        }
    }
}
