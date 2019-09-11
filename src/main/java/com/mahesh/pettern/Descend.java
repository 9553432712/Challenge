package com.mahesh.pettern;


/*
Author: Mahesh Punugupati
*/

public class Descend {
    public static void main(String arg[]){
        int n=5;
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--)
                System.out.print("* ");
            System.out.println();
        }
    }
}

/*
 ******
 *****
 ****
 ***
 **
 *
 */