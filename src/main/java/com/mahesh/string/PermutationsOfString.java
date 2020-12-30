package com.mahesh.string;

public class PermutationsOfString {
  public static void main(String ar[]){
    String s = "mma.sdfs";
    for(String ss: s.split("\\.")){
      System.out.println(ss);
    }
  }
  public static void perm(String st, String rem){
    if(st.length()==0){
      System.out.println(rem);
    }
    for(int i=0;i<st.length();i++){
      //char c =
    }
  }
}
