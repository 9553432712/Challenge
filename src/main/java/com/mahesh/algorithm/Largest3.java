package com.mahesh.algorithm;


/*
Author: Mahesh Punugupati
*/


public class Largest3 {
    public static void main(String arg[]){
        int a[] =  {2,4,4,5,1,2,3,5};
        int m1,m2,m3;
        m1=m2=m3= a[0];
        for(int i=0;i<a.length;i++){
            if(m1<a[i] ){
                if(m2<a[i]) {
                    m2 = a[i];
                }
                m1=a[i];
            }
            if(m2<a[i] && m2<m1) {
                m2=a[i];
            }
        }
        System.out.println(m1);
        System.out.println(m2);
//        System.out.println(m3);
    }
}
