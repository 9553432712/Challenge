package com.mahesh.pettern;


/*
Author: Mahesh Punugupati
*/
/*


 */

public class Butterfly {
    public static void pettern1(){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--)
                System.out.print(" ");
            for(int k=0;k<i;k++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=n;j>i;j--)
                System.out.print(" ");
            for(int k=n;k>n-i;k--)
                System.out.print("* ");
            System.out.println();
        }
    }
    public static void pettern2(){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--)
                System.out.print("* ");
            for(int k=0;k<i;k++)
                System.out.print(" ");
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=n;j>i;j--)
                System.out.print("* ");
            for(int k=n;k>n-i;k--)
                System.out.print(" ");
            System.out.println();
        }
    }
    public static void main(String ar[]){
        pettern2();
    }
}
