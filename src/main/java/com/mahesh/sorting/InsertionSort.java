package com.mahesh.sorting;


/*
Author: Mahesh Punugupati
*/


public class InsertionSort {
    public static void main(String ar[]) {
        int a[] = {0, 6, 1, 5, 2, 4, 3};
        print(insertion(a));
    }

    //i=1,{6  temp=1}
    //i=2,{1,6,  t=5

    private static int[] insertion(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j > 0 && temp < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
        return a;
    }

    public static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
