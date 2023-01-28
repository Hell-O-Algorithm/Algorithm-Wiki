package study.week3.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number11725 {
    static List<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] checkGraph;
    static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int nodeCount = Integer.parseInt(br.readLine());

        checkGraph = new boolean[nodeCount + 1];
        answer = new int[nodeCount + 1];
        StringTokenizer st;
        for (int i = 0; i < nodeCount + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < nodeCount - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            graph.get(start).add(end);
            graph.get(end).add(start);
        }

        for (int i = 1; i < nodeCount + 1; i++) {
            if (!checkGraph[i]) {
                DFS(i);
            }
        }

        for (int i = 2; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

    }

    public static void DFS(int x) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);
        checkGraph[x] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();

            int size = graph.get(now).size();
            for (int i = 0; i < size; i++) {
                int value = graph.get(now).get(i);

                if (!checkGraph[value]) {
                    queue.offer(value);
                    checkGraph[value] = true;
                }
                if (answer[value] == 0) {
                    answer[value] = now;
                }
            }
        }
    }
}
