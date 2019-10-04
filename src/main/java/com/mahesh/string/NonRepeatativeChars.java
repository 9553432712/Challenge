package com.mahesh.string;

import java.util.HashMap;
import java.util.Map;
public class NonRepeatativeChars {
    public static void main(String ar[]){
        String compString = "hema sai ";
        HashMap<Character, Integer> h = new HashMap();
        int count =0;
        for(int i = 0; i< compString.length(); i++){
            if(h.containsKey(compString.charAt(i))){
                h.put(compString.charAt(i),h.get(compString.charAt(i))+1);
            }
            else{
                h.put(compString.charAt(i), 1);
            }
        }
        for(Map.Entry<Character, Integer> entry:h.entrySet()){
            if(entry.getValue()==1)
                count++;
        }
        System.out.println(count);
    }
}
