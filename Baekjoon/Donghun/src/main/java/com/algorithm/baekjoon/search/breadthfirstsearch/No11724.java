package com.algorithm.baekjoon.search.breadthfirstsearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No11724 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        List<List<Integer>> lists = new ArrayList<>();
        boolean[] visited = new boolean[n + 1];
        for (int i = 0; i < n + 1; i++) {
            lists.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            lists.get(s).add(e);
            lists.get(e).add(s);
        }
        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                count++;
//                DFS(lists, visited, i);
                BFS(lists, visited, i);
            }
        }
        System.out.println(count);
    }

    static void DFS(List<List<Integer>> lists, boolean[] visited, int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        for (int i : lists.get(v)) {
            if (visited[i] == false) {
                DFS(lists, visited, i);
            }
        }
    }

    private static void BFS(List<List<Integer>> lists, boolean[] visited, int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);

        while (!queue.isEmpty()) {
            int data = queue.poll();
            visited[data] = true;

            for (int i = 0; i < lists.get(data).size(); i++) {
                int result = lists.get(data).get(i);
                if (!visited[result]) {
                    visited[result] = true;
                    queue.add(result);
                }
            }
        }
    }
}