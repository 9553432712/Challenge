package com.mahesh;


/*
Author: mahesh punugupati
*/


import java.util.concurrent.Callable;

class CollableExample implements Callable {
    public static void main(String arg[])throws Exception{
        Callable c= new CollableExample();
//        Thread t = new Thread(c);

    }

    public Object call() {
        System.out.println("mahesh");
        return "mmm";
    }
}

//Dockerfile
//pull jdk
//cmd jar tme/jar
//run "java -jar "
//docker build -f imagname
//
//
//docker-compose
//
//
//0,10,20
//
//17.68*3

