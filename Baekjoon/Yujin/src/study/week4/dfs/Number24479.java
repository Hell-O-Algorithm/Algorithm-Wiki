package study.week4.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Number24479 {
    static List<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] checkGraph;
    static int[] graphOrder;

    static int count = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        checkGraph = new boolean[n + 1];
        graphOrder = new int[n + 1];

        for (int i = 0; i < (n + 1); i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            graph.get(start).add(end);
            graph.get(end).add(start);
        }

        for (int i = 1; i < (n + 1); i++) {
            Collections.sort(graph.get(i));
        }

        graphOrder[r] = count;
        DFS(r);

        for (int i = 1; i < (n + 1); i++) {
            System.out.println(graphOrder[i]);
        }
    }

    public static void DFS(int r) {
        checkGraph[r] = true;

        int size = graph.get(r).size();
        for (int i = 0; i < size; i++) {
            int num = graph.get(r).get(i);
            if (!checkGraph[num]) {
                count++;
                graphOrder[num] = count;
                DFS(num);
            }
        }
    }
}
