package com.mahesh.algorithm;


/*
Author: Mahesh Punugupati
*/


public class Palndrome_String {
    public static void main(String ar[]){
        String s = "manam";
        StringBuilder sb= new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        if(s.equals(sb.toString())){
            System.out.println("YUP");
        }
        else {
            System.out.println("NOPE");
        }
    }
}
