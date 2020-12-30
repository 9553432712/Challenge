package com.mahesh.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateNumber {
  public static void main(String[] ar) {
    Integer[] i = {1, 3, 5, 6, 7, 5};
    List<Integer> l = Arrays.asList(i);
    Map<Integer, Integer> m = new HashMap<>();
    l.stream().forEach(x -> m.put(x, m.getOrDefault(x, 0) + 1)
    );
    m.entrySet().parallelStream().filter(e-> e.getValue()>1).forEach(e->System.out.println(e.getKey()));
//    System.out.println(l);
  }
}
