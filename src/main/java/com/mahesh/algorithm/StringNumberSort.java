package com.mahesh.algorithm;


/*
Author: Mahesh Punugupati
*/


import java.util.ArrayList;
import java.util.Arrays;

public class StringNumberSort {
    public static void main(String arr[]){
        String input = "MAHES1MA";
        process(input);
    }
    public static void process(String input){
        String s = "";
        String in = "";
        ArrayList a = new ArrayList();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)>=65 && input.charAt(i)<=90){
                if(in.length()>0){
                    a.add(in);
                }
                in = "";
                s = s+input.charAt(i);
            }
            else {
                if(s.length()>0){
                    a.add(s);
                }
                s = "";
                in = in+input.charAt(i);
            }
        }
        if(s.length()>0){
            a.add(s);
        }
        if(in.length()>0){
            a.add(in);
        }
        String result = "";
        for(int i=0;i<a.size();i++){
            char[] temp = a.get(i).toString().toCharArray();
            Arrays.sort(temp);
            result = result+new String(temp);
        }
        System.out.println(result);
    }
}
