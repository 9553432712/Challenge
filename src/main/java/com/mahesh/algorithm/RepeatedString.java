package com.mahesh.algorithm;


/*
Author: Mahesh Punugupati
*/


public class RepeatedString {
    public static void main(String arg[]){
        long l = 554045874191L;
        System.out.println(repeatedString("cfimaakj",554045874191L));
    }
    static long repeatedString(String s, long n) {
        StringBuilder result=new StringBuilder();
        long counter=0;
        if(s.length()==1){
            return n;
        }

        for(long i=0;i<s.length();i++){
            if(s.charAt((int)i)=='a'){
                counter+=1;
            }
        }
        counter = n/s.length()*counter;
        long x=n%s.length();
        for(int i=0;i<x;i++){
            if(s.charAt(i)=='a'){
                counter+=1;
            }
        }
        // while(n>result.length()){
        //     System.out.println(result);
        //     result.append(s);
        // }
        // for(int i=0;i<n;i++){
        //     if(result.charAt(i)=='a'){
        //         counter+=1;
        //     }
        // }
        return counter;
    }
}
