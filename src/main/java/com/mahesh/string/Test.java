package com.mahesh.string;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
  public static void main(String a[]){
    String s[] = {"jj", "kk","aa"};
    M m = new M();
    Arrays.sort(s, m);
    System.out.println(s);
    for(String k: s){
      System.out.println(k);
    }
    System.out.println(Arrays.binarySearch(s,"aa"));
  }
  static class M implements Comparator<String>{
    @Override
    public int compare(String a, String b){
      return b.compareTo(a);
    }
/*
    @Override
    public int compare(Object o1, Object o2) {
      return 0;
    }*/
  }
}
