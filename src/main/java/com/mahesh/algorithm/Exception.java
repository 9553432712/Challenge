package com.mahesh.algorithm;


/*
Author: 
*/


import java.io.IOException;

public class Exception {
    static String ha;
    public static void main(String arg[]) throws java.lang.Exception {
        System.out.println(ha);
        System.out.println(hi());
    }
    static int hi()throws java.lang.Exception {
        try{
            throw new IOException();
        }
        finally {
            return -1;
        }
    }
}
