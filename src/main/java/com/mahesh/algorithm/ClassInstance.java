package com.mahesh.algorithm;


/*
Author: 
*/

class A{

}
class B extends A{

}
class C extends B{

}

public class ClassInstance {
    public static void main(String arg[]){
        B b=new B();
        System.out.println(b instanceof C);
    }
}
