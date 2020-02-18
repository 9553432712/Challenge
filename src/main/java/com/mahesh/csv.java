package com.mahesh;


/*
Author: Mahesh Punugupati
*/


import java.util.HashSet;
import java.util.Random;

public class csv {
    final static int COUNT = 1000;
    static String randomMACAddress(){
        Random rand = new Random();
        byte[] macAddr = new byte[6];
        rand.nextBytes(macAddr);
        macAddr[0] = (byte)(macAddr[0] & (byte)254);  //zeroing last 2 bytes to make it unicast and locally adminstrated
        StringBuilder sb = new StringBuilder(18);
        for(byte b : macAddr){
            if(sb.length() > 0)
                sb.append(":");
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
    public static void main(String ar[]){
        HashSet<String> macRam = new HashSet<>();
        for(int i=0;i<1000;i++) {
            macRam.add(randomMACAddress());
        }
//        macRam.stream().forEach(s -> System.out.println(s));
        serialNumber();
    }
    static String[] serialNumber(){
        String[] serial = new String[COUNT];
        for(int i=0;i<COUNT;i++){
            System.out.println("MP"+String.format("%010d",i));
        }
        return serial;
    }
}
