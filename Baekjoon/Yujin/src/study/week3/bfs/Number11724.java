package study.week3.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number11724 {
    static List<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] checkGraph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int nodeCount = Integer.parseInt(st.nextToken());
        int edgeCount = Integer.parseInt(st.nextToken());

        checkGraph = new boolean[nodeCount + 1];
        for (int i = 0; i <= nodeCount; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edgeCount; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            graph.get(start).add(end);
            graph.get(end).add(start);
        }

        int answer = 0;
        for (int i = 1; i < graph.size(); i++) {
            if (!checkGraph[i]) {
                DFS(i);
                answer += 1;
            }
        }
        System.out.println(answer);
    }

    public static void DFS(int start) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        checkGraph[start] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            int size = graph.get(now).size();

            for (int i = 0; i < size; i++) {

                int value = graph.get(now).get(i);
                if (!checkGraph[value]) {
                    queue.offer(value);
                    checkGraph[value] = true;
                }
            }
        }
    }
}
