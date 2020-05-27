package com.mahesh;


/*
Author: Mahesh punugupati
*/


public class SortedRotatedPairSum {
    static boolean sortedRotatedPairSum(int a[], int key){
        int n=a.length,i;
        for(i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
                break;
            }
        }
        int l=(i+1)%n;
        int h=i;
        System.out.println(l+""+h);
        while (l!=h){
            if(a[l]+a[h]==key){
                return true;
            }
            if(a[l]+a[h]<key){
                l=(l+1)%n;
            }
            if(a[l]+a[h]>key){
                h=(h-1+n)%n;
            }
        }
        return false;
    }
    public static void main(String ar[]){
        int a[] = {3,4,5,1,2};
        System.out.println(sortedRotatedPairSum(a, 2));
    }
}
