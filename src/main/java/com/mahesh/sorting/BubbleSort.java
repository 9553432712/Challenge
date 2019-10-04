package com.mahesh.sorting;


public class BubbleSort {

    public static void main(String args[]) {
        System.out.println("----------");

        int a[] = {5, 2, 3, 4};

        print(bubbleSort(a));

    }

    private static int[] bubbleSort(int[] a) {
        int temp;
        int temeComplexity = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                ++temeComplexity;
            }
        }
        System.out.println("temeComplexity" + temeComplexity);
        return a;
    }

    public static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
