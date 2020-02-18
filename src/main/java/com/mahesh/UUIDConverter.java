package com.mahesh;


/*
Author: Mahesh Punugupati
*/


import java.util.Arrays;

public class UUIDConverter {
    public static void main(String ar[]){
        String str = "3e8b7ee0-726a-11e9-a3df-67f7dae6f685";
        System.out.println(str.substring(15, 18) + str.substring(9, 13) + str.substring(0, 8) + str.substring(19, 23) + str.substring(24));
        String a = "London,Paris,Tokyo";
        String[] arrayOfCities = Arrays.stream(a.split(",")).toArray(String[]::new);
        System.out.println(Arrays.toString(arrayOfCities));
    }
}
