package com.mahesh.algorithm;


/*
Author: Mahesh Punugupati
*/


import java.util.HashMap;
import java.util.Map;

public class RepeatingChar {
    public static void main(String arg[]){
        String a = new String ("mahesh");
        HashMap<Character, Integer> m= new HashMap();
        for(int i=0;i<a.length();i++){
            if(m.containsKey(a.charAt(i))){
                m.put(a.charAt(i), (Integer)m.get(a.charAt(i))+1);
            }else {
                m.put(a.charAt(i), 1);
            }
        }
        for(Map.Entry<Character, Integer> e : m.entrySet()){
            if(e.getValue()==1) {
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }
    }
}
