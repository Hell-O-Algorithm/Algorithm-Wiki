package com.example.demo.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class MyBFS {
    private int count = 0;

    public MyBFS(int n, int v, int[][] adjMatrix) {
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;

        int count = 0;
        while (!queue.isEmpty()) {
            v = queue.poll();
            count++;
            System.out.println(count);
            for (int i = 1; i < n + 1; i++) {
                if (adjMatrix[v][i] == 1 && !visited[v]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }
}
