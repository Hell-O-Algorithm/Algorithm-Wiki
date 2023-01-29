package study.week3.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Number16173 {

    static int[][] graph;
    static boolean[][] checkGraph;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

        graph = new int[N + 1][N + 1];
        checkGraph = new boolean[N + 1][N + 1];

        for (int i = 1; i < N + 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < N + 1; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 입력 완료

        BFS(1, 1);
    }

    public static void BFS(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{startX, startY});
        checkGraph[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int nowNum = graph[now[0]][now[1]];

            if (graph[now[0]][now[1]] == -1) {
                System.out.println("HaruHaru");
                return;
            }

            int[] X = {0, nowNum};
            int[] Y = {nowNum, 0};

            for (int i = 0; i < 2; i++) {
                int x = now[0] + X[i];
                int y = now[1] + Y[i];

                if (x < 0 || x > N || y < 0 || y > N) {
                    continue;
                }

                if (graph[x][y] != -1 && !checkGraph[x][y]) {
                    queue.offer(new int[]{x, y});

                    checkGraph[x][y] = true;
                } else if (graph[x][y] == -1) {
                    queue.offer(new int[]{x, y});
                }
            }
        }
        System.out.println("Hing");
    }
}
