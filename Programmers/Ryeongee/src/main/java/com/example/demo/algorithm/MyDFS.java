package com.example.demo.algorithm;

public class MyDFS {
    public MyDFS(int n, int v, int[][] adjMatrix) {
        boolean[] visited = new boolean[n + 1];
        dfs(n, v, visited, adjMatrix);
    }

    static void dfs(int n, int v, boolean[] visited, int[][] adjMatrix) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int i = 1; i < n + 1; i++) {
            if (adjMatrix[v][i] == 1 && !visited[i]) {
                dfs(n, i, visited, adjMatrix);
            }
        }
    }
}
