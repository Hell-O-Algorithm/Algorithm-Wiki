package study.week4.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number2667 {

    static int N;
    static char[][] graph;
    static boolean[][] checkGraph;
    static List<Integer> houseList = new ArrayList<>();
    static int count;
    static int houseCount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        graph = new char[N][];
        checkGraph = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            graph[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!checkGraph[i][j] && graph[i][j] == '1') {
                    houseCount += 1;
                    DFS(i, j);
                    houseList.add(count);
                    count = 0;
                }
            }
        }

        System.out.println(houseCount); // 총 단지 수
        Collections.sort(houseList);
        for (int houseCount : houseList) {
            System.out.println(houseCount); // 단지 내 집 수
        }
    }

    public static void DFS(int x, int y) {
        checkGraph[x][y] = true;
        count += 1;

        int[] xArr = {0, 0, -1, 1};
        int[] yArr = {1, -1, 0, 0};

        for (int i = 0; i < 4; i++) {
            int newX = x + xArr[i];
            int newY = y + yArr[i];

            if (newX < 0 || newX >= N || newY < 0 || newY >= N) {
                continue;
            }
            if (!checkGraph[newX][newY] && graph[newX][newY] == '1') {
//                checkGraph[newX][newY] = true;
                DFS(newX, newY);
            }
        }

    }
}
