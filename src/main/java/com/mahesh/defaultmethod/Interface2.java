package com.mahesh.defaultmethod;

public interface Interface2 {
    default void hai(){
        System.out.println("22222222222");
    }
    static void staticMethod(){
        System.out.println("static 2");
    }
}
