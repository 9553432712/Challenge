package com.mahesh.graph;


/*
Author: Mahesh Punugupati
*/


public class DijkstraAlg {
    int V = 4;
    boolean[] visited = new boolean[V];
    int[][] graph = {
            {0, 2, 0, 4},
            {3, 0, 0, 4},
            {0, 1, 0, 4},
            {0, 2, 0, 0},
    };

    public static void main(String ar[]) {
        DijkstraAlg dijkstraAlg = new DijkstraAlg();
        dijkstraAlg.dijkstra(0);
    }

    public void dijkstra(int from) {
        int[] distance = new int[V];
        for (int i = 0; i < V; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        distance[from] = 0;
        for (int i = 0; i < V; i++) {
            int u = findMinimum(distance);
            visited[u] = true;
            for (int j = 0; j < V; j++) {
                if (distance[j] < distance[u] + graph[u][j])
                    distance[j] = distance[u] + graph[u][j];
            }
        }
        for (int i = 0; i < V; i++) {
            System.out.println(distance[i] + " " + visited[i]);
        }
    }

    private int findMinimum(int[] distance) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < V; i++) {
            if (distance[i] < min && !visited[i])
                min = distance[i];
        }
        return min;
    }
}
