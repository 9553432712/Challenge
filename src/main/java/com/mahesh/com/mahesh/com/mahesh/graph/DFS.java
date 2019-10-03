package com.mahesh.com.mahesh.com.mahesh.graph;


/*
Author: Mahesh Punugupati
*/


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DFS {
    int V;
    LinkedList[] edges;
    int[] visited;
    DFS(int k){
        V = k;
        edges = new LinkedList[k];
        visited = new int[k];
        for (int i=0;i<V;i++){
            edges[i] = new LinkedList();
        }
    }
    public void addEdge(int from, int to){
        edges[from].add(to);
    }
    public void print(){
        for (int i=0;i<V ;i++) {
            System.out.println(edges[i]);
        }
    }
    public void dfSearch(int i){
        Stack<Integer> stack = new Stack();
        stack.push(i);
        while (!stack.empty()){
            int j =stack.pop();
            visited[j] = 1;
            System.out.println(""+j);
            Iterator<Integer> iterator = edges[j].listIterator();
            while (iterator.hasNext()){
                int x = iterator.next();
                if(visited[x]!=1)
                    stack.push(x);
            }
        }
    }
    public static void main(String arg[]){
        DFS dfs = new DFS(4);
        dfs.addEdge(0,1);
        dfs.addEdge(0,2);
        dfs.addEdge(1,2);
        dfs.addEdge(2,3);
        dfs.addEdge(3,0);
//        dfs.print();
        dfs.dfSearch(3);
    }
}
