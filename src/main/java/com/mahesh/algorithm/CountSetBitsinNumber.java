package com.mahesh.algorithm;


/*
Author: Mahesh Punugupati
*/


import java.util.ArrayList;

public class CountSetBitsinNumber {
    static ArrayList arr = new ArrayList();
    public static void main(String ar[]){
        int n=100;
        for (int i=0;i<n;i++){
            System.out.println("for "+i);
            binery(i);
            for(int x=arr.size()-1;x>=0;x--){
                System.out.print(arr.get(x));
            }
            arr.clear();
            System.out.println();
        }
    }
    public static void binery(int n){
        if(n==0 || n<0) {
            arr.add(0);
            return;
        }
        arr.add(n%2==0?0:1);
        binery(n/2);
    }
}
