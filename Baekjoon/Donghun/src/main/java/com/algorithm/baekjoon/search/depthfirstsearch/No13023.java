package com.algorithm.baekjoon.search.depthfirstsearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No13023 {
    static boolean arrive;

    public static void main(String[] args) throws IOException {
        arrive = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<List<Integer>> A = new ArrayList<>();
        boolean[] visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            A.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            A.get(S).add(E);
            A.get(E).add(S);
        }
        for (int i = 0; i < N; i++) {
            DFS(A, visited, i, 1);
            if (arrive)
                break;
        }
        if (arrive)
            System.out.println("1");
        else
            System.out.println("0"); // 5의 깊이가 없다면 0 출력
    }

    public static void DFS(List<List<Integer>> lists, boolean[] visited, int now, int depth) { // DFS구현
        if (depth == 5 || arrive) { // 깊이가 5가되면 프로그램 종료
            arrive = true;
            return;
        }
        visited[now] = true;
        for (int i : lists.get(now)) {
            if (!visited[i]) {
                DFS(lists, visited, i, depth + 1);
            }
        }
        visited[now] = false;
    }
}