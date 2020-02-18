package com.mahesh.defaultmethod;


/*
Author: mahesh punugupati
*/


public class DefaultCheck implements Interface1, Interface2{
    public void hai(){
        System.out.println("3333333333");
    }

    public static void main(String a[]){
        DefaultCheck defaultCheck = new DefaultCheck();
        defaultCheck.hai();
        Interface2.staticMethod();
        Interface1.staticMethod();
    }
}
