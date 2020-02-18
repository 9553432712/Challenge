package com.mahesh.defaultmethod;

public interface Interface1 {
    default  public void hai(){
        System.out.println("1111111");
    }
    static void staticMethod(){
        System.out.println("static 1");
    }
}
