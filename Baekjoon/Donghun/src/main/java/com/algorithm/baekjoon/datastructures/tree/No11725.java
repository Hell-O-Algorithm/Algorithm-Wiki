package com.algorithm.baekjoon.datastructures.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class No11725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[] visit = new boolean[N + 1];
        List<List<Integer>> tree = new ArrayList<>();
        int[] answer = new int[N + 1];
        for (int i = 0; i < N + 1; i++) {
            tree.add(new ArrayList<>());
        }
        for (int i = 1; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            tree.get(n1).add(n2);
            tree.get(n2).add(n1);
        }
//        DFS(tree, answer, visit, 1);
        BFS(tree, answer, 1);
        for (int i = 2; i <= N; i++) {
            System.out.println(answer[i]);
        }
    }

    static void DFS(List<List<Integer>> tree, int[] answer, boolean[] visit, int number) {
        visit[number] = true;
        for (int i : tree.get(number)) {
            if (!visit[i]) {
                answer[i] = number;
                DFS(tree, answer, visit, i);
            }
        }
    }

    private static void BFS(List<List<Integer>> tree, int[] answer, int start) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(start);
        answer[start] = 1;

        while (!queue.isEmpty()) {
            int parent = queue.poll();

            for (int item : tree.get(parent)) {
                if (answer[item] == 0) {
                    answer[item] = parent;
                    queue.offer(item);
                }

            }// end for
        }
    }
}