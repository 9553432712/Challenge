package com.mahesh.algorithm;


/*
Author: Mahesh Punugupati
*/


import java.util.Scanner;

public class IsBinery {
    public static void main(String[] args)
    {
        int num;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        String s = new String(""+num);
        int n=0;
        for(int i=s.length()-1,j=0;i>=0;i--,j++){
            char c = s.charAt(i);
            switch(c){
                case '1':
                    n+= Math.pow(2,j)*1;
                    System.out.println("The number is:"+n);
                    break;
                case '0':
                    n+= Math.pow(2,j)*0;
                    System.out.println("The number is:"+n);
                    break;
            }
        }

        /*
             Your logic goes here
        */

        System.out.println("The number is:"+n);

    }
}
