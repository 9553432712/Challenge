package com.mahesh.optum;


/*
Author: mahesh punugupati
*/


import java.util.Arrays;

public class Split {
    public static void main(String a[]){
        final Integer i=0;
        String s="hi dude, how r u, fine?";
        Arrays.stream(s.split(",",3)).forEach(si->System.out.println(si));

    }
}
