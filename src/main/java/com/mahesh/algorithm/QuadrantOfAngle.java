package com.mahesh.algorithm;


/*
Author: Mahesh Punugupati
*/


public class QuadrantOfAngle {
    public static void main(String arg[]){
        int angle = 279;
        if(angle>0 && angle<90){
            System.out.println("Q1");
        }else if(angle>90 && angle<180){
            System.out.println("Q2");
        }else if(angle>180 && angle<270){
            System.out.println("Q3");
        }else if(angle>270 && angle<360){
            System.out.println("Q4");
        }
    }
}
