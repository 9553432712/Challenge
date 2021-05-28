package com.mahesh.string;

public class PermutationsOfString {
  public static void main(String ar[]){
    String s = "abc";
    combinations(s);
  }
  public static void combinations(String st){
    if(st.length()==0){
      System.out.println(st);
    }
    for(int i=0;i<st.length();i++){
      for(int j=i+1;j<=st.length();j++){
        System.out.println(st.substring(i,j));
      }
    }
  }
}
