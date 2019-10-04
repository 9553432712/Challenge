package com.mahesh.string;


/*
Author: Mahesh Punugupati
*/


public class LongestNonRepeatString {
    public static void main(String args[]) {
        String s = "mahesh";
        String result = "";
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (temp.contains("" + s.charAt(i))) {
                if (result.length() < temp.length()) {
                    result = temp;
                    temp = "" + s.charAt(i);
                }
            } else {
                temp = temp + s.charAt(i);
            }
        }
        result = result.length() < temp.length() ? temp : result;
        System.out.println(result);
    }
}
