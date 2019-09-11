package com.mahesh.pettern;


/*
Author: Mahesh Punugupati
*/


public class Ascend {
    public static void main(String a[]){
        int n=7;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
