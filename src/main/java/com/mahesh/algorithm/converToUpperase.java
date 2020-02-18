package com.mahesh.algorithm;


/*
Author: Mahesh Punugupati
*/


public class converToUpperase
{
    public static void main(String art[]){
        String s = "mah%^esh";
//        for(int i=97;i<123;i++){
//            System.out.println((char)i);
//        }
//        97-65
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122){
                System.out.println((char) (s.charAt(i)-32));
            }else{
                System.out.println(s.charAt(i));
            }
        }
    }
}
