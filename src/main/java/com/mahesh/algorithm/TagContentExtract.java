package com.mahesh.algorithm;


/*
Author: Mahesh Punugupati
*/
import java.util.Scanner;

public class TagContentExtract{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            int s1 = line.indexOf("<");
            int s2 = line.indexOf(">");
            String tag = line.substring(s1+1,s2);
//            System.out.println(tag);
            System.out.println(line.substring(s2+1, line.lastIndexOf("/"+tag)-1));
//            if()

                //Write your code here

                testCases--;
        }
    }
}



