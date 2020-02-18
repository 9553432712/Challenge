package com.mahesh.algorithm;


/*
Author: Mahesh Punugupati
*/


import java.util.ArrayList;

public class StartAndEndWithBit {
    public static void main(String are[]){
        ArrayList result = new ArrayList();
        String s = "00100101";
        ArrayList<Integer> count = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count.add(i);
            }
        }
        System.out.println(s);
        for(int i=0;i<count.size();i++) {
            for(int j=i+1;j<count.size();j++) {
                System.out.println(s.substring(count.get(i), count.get(j) + 1));
            }
        }
    }
}
