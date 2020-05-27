package com.mahesh.algorithm;


/*
Author: Mahesh Punugupati
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumWithIndex {
    public static void main(String args[]){
        int a[]= {1,2,3,4};
        int index=5;
        for(int i:twoSum(a,index)){
            System.out.println(i);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int x=0;
        String s = Arrays.toString(nums);
        System.out.println(s+" ");
        List<Integer> a= new ArrayList<Integer>();
        for(int i=0,j=0;i<nums.length;i++,j=j+3){
            x=target-nums[i];
            String l = s.substring(j,s.length()-1);
            if(l.contains(x+"")){
                a.add(x);
                System.out.println(nums[i]+" "+x);
            }
        }
        System.out.println(a);
        int result[]=new int[a.size()];
        for(int i=0,j=0;i<nums.length;i++){
            if(nums[i]==a.get(j)){
                result[j]=i;
                j++;
                if(j==a.size())
                    break;
            }
        }
        return result;
    }
}
