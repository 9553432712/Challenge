package com.mahesh.optum;


/*
Author: mahesh punugupati
*/

class Ex0 extends Exception{}
class Ex1 extends Ex0{}
public class ExceptionHandling {
    public static void main(String m[]){
        try {
            throw new Ex1();
        }catch (Ex0 e){
            System.out.println("ex0");
        }catch (Exception e){
            System.out.println("exception");
        }
    }

}
