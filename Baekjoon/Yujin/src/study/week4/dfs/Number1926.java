package study.week4.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number1926 {
    static int[][] paper;
    static boolean[][] checkedPaper;
    static int n;
    static int m;
    static int area;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 세로
        m = Integer.parseInt(st.nextToken()); // 가로

        paper = new int[n][m];
        checkedPaper = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!checkedPaper[i][j] && paper[i][j] == 1) {
                    count++;
                    DFS(i, j);
                    max = Math.max(max, area);
                    area = 0;
                }
            }
        }
        System.out.println(count);
        System.out.println(max);
    }

    public static void DFS(int x, int y) {
        area += 1;
        checkedPaper[x][y] = true;

        int[] xArr = {0, 0, -1, 1};
        int[] yArr = {1, -1, 0, 0};

        for (int i = 0; i < 4; i++) {
            int newX = (x + xArr[i]);
            int newY = (y + yArr[i]);

            if (newX < 0 || newX >= n || newY < 0 || newY >= m) {
                continue;
            }
            if (!checkedPaper[newX][newY] && paper[newX][newY] == 1) {
//                checkedPaper[newX][newY] = true;
                DFS(newX, newY);
            }
        }
    }
}


