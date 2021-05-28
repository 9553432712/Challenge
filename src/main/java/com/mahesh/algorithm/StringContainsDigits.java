package com.mahesh.algorithm;

/**
 * string contains digits or not
 */
public class StringContainsDigits {
  public static void main(String ar[]){
    String s = "fs2fsd";
    int i = '9';
    System.out.println(i);
    for(char c: s.toCharArray()){
      if(c>=48 && c<=57){
        System.out.println(c);
      }
    }
  }
}
