package study.week4.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number1260 {
    static int[][] graphDFS;
    static int[][] graphBFS;
    static boolean[] checkGraphDFS;
    static boolean[] checkGraphBFS;
    static int N;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        graphDFS = new int[N + 1][N + 1];
        graphBFS = new int[N + 1][N + 1];

        checkGraphDFS = new boolean[N + 1];
        checkGraphBFS = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            graphDFS[start][end] = graphDFS[end][start] = 1;
            graphBFS[start][end] = graphBFS[end][start] = 1;
        }

        // DFS
        DFS(V);
        sb.append("\n");

        // BFS
        BFS(V);
        System.out.println(sb);
    }

    public static void BFS(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        checkGraphBFS[start] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            sb.append(now + " ");

            for (int i = 1; i < N + 1; i++) {
                if (graphBFS[now][i] == 1 && !checkGraphBFS[i]) {
                    queue.offer(i);
                    checkGraphBFS[i] = true;
                }
            }
        }
    }

    public static void DFS(int start) {
        checkGraphDFS[start] = true;
        sb.append(start + " ");
        for (int i = 1; i < N + 1; i++) {
            if (graphDFS[start][i] == 1 && !checkGraphDFS[i]) {
                DFS(i);
            }
        }
    }
}
