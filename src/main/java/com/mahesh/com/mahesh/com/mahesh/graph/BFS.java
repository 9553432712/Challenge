package com.mahesh.com.mahesh.com.mahesh.graph;


/*
Author: Mahesh Punugupati
*/


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    int V;
    LinkedList[] linkedList;
    Queue<Integer> queue = new LinkedList<>();
    int[] visited;
    BFS(int n){
        V = n;
        linkedList = new LinkedList[n];
        visited = new int[n];
        for (int i=0;i<V;i++){
            linkedList[i] = new LinkedList();
        }
    }
    public void addEdge(int from, int to){
        linkedList[from].add(to);
    }
    public void BFSearch(int start){
        queue.add(start);
        while (!queue.isEmpty()){
            System.out.println("-----"+queue);
            int ele = queue.poll();
            visited[ele] = 1;
            System.out.println(ele);
            Iterator<Integer> integerIterator = linkedList[ele].listIterator();
            while (integerIterator.hasNext()){
                int x = integerIterator.next();
                if(visited[x]!=1) {
                    queue.add(x);
                    visited[x]=1;
                }
            }
        }
    }
    public static void main(String arg[]){
        BFS bfs = new BFS(4);
        bfs.addEdge(0,1);
        bfs.addEdge(0,2);
        bfs.addEdge(1,2);
        bfs.addEdge(2,3);
        bfs.addEdge(3,0);
//        dfs.print();
        bfs.BFSearch(3);
    }
}
