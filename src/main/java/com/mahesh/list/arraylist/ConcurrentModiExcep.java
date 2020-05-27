package com.mahesh.list.arraylist;


/*
Author: Mahesh Punugupati
*/


import java.util.ArrayList;
import java.util.Arrays;

public class ConcurrentModiExcep {
    public static void main(String are[]){
        ArrayList<String> a = new ArrayList<>(Arrays.asList("1","2","3"));
        //for(int i=0;i<a.size();i++){
        for(String i:a){
            System.out.println(i);
            //if(a.get(i).equals("1")){
            if(i.equals("1")){
                a.remove("1");
            }
        }
        System.out.println(a);
    }
}
