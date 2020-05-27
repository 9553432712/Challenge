package com.mahesh;


/*
Author: mahesh punugupati
*/

@FunctionalInterface
interface Adding{
    int add(int a, int b);
}



public class Loylogic {
    public static void main(String ar[]){
//        int a=10,b=20;
        Adding add = (a,b)-> {
            return a+b;
        };

        System.out.println(add.add(1,2));
    }

}
