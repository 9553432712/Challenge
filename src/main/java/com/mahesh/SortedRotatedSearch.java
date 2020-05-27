package com.mahesh;


/*
Author: Mahesh Punugupati
*/


public class SortedRotatedSearch {
    private int x;
    private int y;
    public SortedRotatedSearch(){
        System.out.println("in base");
        x=5;
    }

}
class ex extends SortedRotatedSearch{
    private int x;
    public ex(){
        System.out.println("in deriv");
        x=6;
    }
    public int getX(String o){
        System.out.println("Stri");
        return x;
    }
    public int getX(Object x){
        System.out.println("object");
        return this.x;
    }
    public static void main(String ar[]){
        int i=010;
        int j=07;
        System.out.println(i);
        System.out.println(j);
        ex e = new ex();
        System.out.println(e.x);
        String s1="abc";
        String s2=s1;
        s1+="d";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1+" "+s2+"  "+s1==s2);
        StringBuffer s3=new StringBuffer("abc");
        StringBuffer s4=s3;
        s3.append("d");
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s3==s4);
        System.out.println(e.getX(null));
//        System.out.println(e.y);
        String StrArr[]={"JAVA","JDK","JRE"};
        String Str="JAVa";
        System.out.println(StrArr[0]==Str);
    }
}
