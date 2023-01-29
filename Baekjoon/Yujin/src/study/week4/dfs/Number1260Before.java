package study.week4.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number1260Before {
    static List<ArrayList<Integer>> graphDFS = new ArrayList<>();
    static List<ArrayList<Integer>> graphBFS = new ArrayList<>();
    static boolean[] checkGraphDFS;
    static boolean[] checkGraphBFS;
    static List<Integer> answerDFS = new ArrayList<>();
    static List<Integer> answerBFS = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        checkGraphDFS = new boolean[N + 1];
        checkGraphBFS = new boolean[N + 1];
        for (int i = 0; i < N + 1; i++) {
            graphDFS.add(new ArrayList<>());
            graphBFS.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            graphDFS.get(start).add(end);
            graphDFS.get(end).add(start);
            graphBFS.get(start).add(end);
            graphBFS.get(end).add(start);
        }

        for (int i = 0; i < N; i++) {
            Collections.sort(graphDFS.get(i));
            Collections.sort(graphBFS.get(i));
        }

        // DFS
        DFS(V);
        for (int i = 0; i < answerDFS.size(); i++) {
            System.out.print(answerDFS.get(i) + " ");
        }
        System.out.println();

        // BFS
        BFS(V);
        for (int i = 0; i < answerBFS.size(); i++) {
            System.out.print(answerBFS.get(i) + " ");
        }
    }

    public static void BFS(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        answerBFS.add(start);
        checkGraphBFS[start] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            int size = graphBFS.get(now).size();

            for (int i = 0; i < size; i++) {
                int next = graphBFS.get(now).get(i);

                if (!checkGraphBFS[next]) {
                    queue.offer(next);
                    checkGraphBFS[next] = true;
                    answerBFS.add(next);
                }
            }
        }
    }

    public static void DFS(int start) {
        checkGraphDFS[start] = true;
        answerDFS.add(start);

        int size = graphDFS.get(start).size();
        for (int i = 0; i < size; i++) {
            int next = graphDFS.get(start).get(i);
            if (!checkGraphDFS[next]) {
                DFS(next);
            }
        }
    }
}
