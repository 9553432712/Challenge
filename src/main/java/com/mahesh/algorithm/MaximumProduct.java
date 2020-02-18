package com.mahesh.algorithm;


/*
Author: Mahesh Punugupati
*/


import java.util.Arrays;

public class MaximumProduct {
    public static void main(String ar[]){
        int a[] = {1,2,-5,-4,4};
        Arrays.sort(a);
        Arrays.stream(a).forEach(x->System.out.println(x));
        if(a[0]*a[1]<a[a.length-1]*a[a.length-2]){
            System.out.println(a[a.length-1]*a[a.length-2]);
        }else {
            System.out.println(a[0]*a[1]);
        }
    }
}
