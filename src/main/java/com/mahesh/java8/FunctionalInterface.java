package com.mahesh.java8;


/*
Author: Mahesh
*/

@java.lang.FunctionalInterface
public interface FunctionalInterface {
    void hi();
    boolean equals(Object o);

    int hashCode();

    default void hello(){

    }
    static void decide(){

    }
}
