package com.mahesh.algorithm;


/*
Author: 
*/


import java.util.*;

public class HashMapSort {
    int i;
    public static void main(String[] arg){
        HashMap<String, String> h = new LinkedHashMap<>();
        h.put("mahesh","mahesh");
        h.put("aa", "bb");
        h.put("bb", "aa");

        Float x = new Float("3.0");
        int y=x.intValue();
        byte b=x.byteValue();
        double d=x.doubleValue();
        System.out.println(y+b+d);

        List<Map.Entry<String, String>> l = new ArrayList<>(h.entrySet());
        /*Collections.sort(l, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare( Map.Entry<String, String>o1, Map.Entry<String, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });*/

        Collections.sort(l, (Map.Entry<String, String> m1, Map.Entry<String, String>m2) ->  m1.getValue().compareTo(m2.getValue()));
        h = new LinkedHashMap<>();
        for(Map.Entry<String, String>a: l){
            h.put(a.getKey(),a.getValue());
        }
        System.out.println(h);
        Collections.sort(l,Collections.reverseOrder());
    }
}
