package study.week3.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1388 {

    static int height;
    static int width;
    static char[][] graph;
    static boolean[][] checkGraph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        height = Integer.parseInt(st.nextToken());
        width = Integer.parseInt(st.nextToken());

        graph = new char[height][width];
        checkGraph = new boolean[height][width];

        for (int i = 0; i < height; i++) {
            graph[i] = br.readLine().toCharArray();
        }

        int answer = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (checkGraph[i][j]) {
                    continue;
                }

                if (graph[i][j] == '-') {
                    DFS(i, j, true);
                } else {
                    DFS(i, j, false);
                }
                answer += 1;
            }
        }
        System.out.println(answer);
    }

    public static void DFS(int startX, int startY, boolean isheight) {
        checkGraph[startX][startY] = true;
        if (isheight) {
            startY += 1;
            if (startY < width && graph[startX][startY] == '-') {

                DFS(startX, startY, true);
            }
        } else {
            startX += 1;
            if (startX < height && graph[startX][startY] == '|') {

                DFS(startX, startY, false);
            }
        }


    }
}
