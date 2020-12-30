package com.mahesh;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateChar {
  public static void main(String ar[]){
    String s = "mahesh";
    char[] c= s.toCharArray();

    Arrays.sort(c);
    Map<Character, Integer> map = new LinkedHashMap<>();
    for(char i:s.toCharArray()){
      map.put(i, map.getOrDefault(i, 0)+1);
    }
    List<Map.Entry<Character, Integer>> entry = map.entrySet().parallelStream().filter(x -> x.getValue()>1).collect(Collectors.toList());
    System.out.println(entry.toString());

  }
}
