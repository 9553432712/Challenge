package com.mahesh.algorithm;


/*
Author: Mahesh Punugupati
*/


public class Convert0to5 {
    public static void main(String arg[]){
        int n = 1040;
        int result = 0;
//        do {
//            int r = n%10;
//            if(r==0){
//                r=5;
//            }
//            result = r+result*10 ;
//            n=n/10;
//        }while ((n>0));
        System.out.println(convert(n));
    }
    static int convert(int n){
        if(n==0){
            return 5;
        }
        int r = n%10;
        if(r==0){
            r=5;
        }
        return convert(n/10)*10+r;
    }
}
