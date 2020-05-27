package com.mahesh.stream;


/*
Author: Mahesh Punugupati
*/


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamVSParllelStream
{
    public static void main(String a[]){
        ArrayList<String> aa = new ArrayList<String>();
        for(int i=0;i<100000;i++){
            aa.add("mahesh");//getAlphaNumericString(20));
        }
//        usingStream(aa);
        usingParllelStream(aa);
//        usingForEach(aa);
//        usingStreamForEach(aa);
    }
    static void usingStream(ArrayList<String> aa){
        System.out.println("in stream ");
        List<String> bb = new ArrayList<String>();
        Long l= System.currentTimeMillis();
        bb = aa.stream().map(
                s -> s.concat("ma")
        ).collect(Collectors.toList());
        Long m = System.currentTimeMillis();
        System.out.println(m-l);
    }
    static void usingStreamForEach(ArrayList<String> aa){
        System.out.println("in stream for each");
        Long l= System.currentTimeMillis();
        ArrayList<String> bb = new ArrayList<String>();
        aa.stream().forEach(
                s -> bb.add(s.concat("ma"))
        );
        Long m = System.currentTimeMillis();
        System.out.println(m-l);
    }
    static void usingParllelStream(ArrayList<String> aa){
        System.out.println("in parllel ");
        List<String> bb = new ArrayList<String>();
        Long l= System.currentTimeMillis();
        bb = aa.parallelStream().map(s -> s.concat("ma")).collect(Collectors.toList());
        Long m = System.currentTimeMillis();
        System.out.println(m-l);
    }
    static void usingForEach(ArrayList<String> aa){
        System.out.println("in for each ");
        ArrayList<String> bb = new ArrayList<String>();
        Long l= System.currentTimeMillis();
        for(String a: aa){
            bb.add(a.concat("ma"));
        }
        Long m = System.currentTimeMillis();
        System.out.println(m-l);
    }

    static String getAlphaNumericString(int n)
    {
        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }
}
