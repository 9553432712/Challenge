package com.mahesh.algorithm;

public class ReverseString {
  static String result = "";
  public static void main(String[] at) {
    String s = "mahesh";
    System.out.println(reverseRecursion(s));

    System.out.println(result);
  }

  public static String reverseRecursion(String s) {

    if (s==null || s.length()==0) {
      return "";
    }
    result +=""+s.charAt(s.length()-1);
    return s.charAt(s.length()-1)+reverseRecursion(s.substring(0, s.length()-1));
  }
}
