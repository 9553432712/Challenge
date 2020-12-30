package com.mahesh.algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {
  public static void main(String ar[]) {
    int[] i = {1, 2, 3, 4, 5};
    List<Integer> l = Arrays.stream(i).boxed().collect(Collectors.toList());
    Collections.reverse(l);
    l.stream().forEach(a -> System.out.println(a));

    for (int x = 0; x < i.length / 2; x++) {
      int temp = i[x];
      i[x] = i[i.length - x - 1];
      i[i.length - x - 1] = temp;
    }

    Arrays.stream(i).forEach(System.out::print);
  }
}
