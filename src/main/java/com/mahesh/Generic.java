package com.mahesh;


/*
Author: Mahesh Punugupati
*/


public class Generic<T> {
    T obj;
    public static void main(String arg[]){
        Generic g = new Generic();
        g.obj="aa";
        System.out.println(g.obj);
        g.obj=1;
        System.out.println(g.obj);
        g.obj="%";
        System.out.println(g.obj);

    }
}
