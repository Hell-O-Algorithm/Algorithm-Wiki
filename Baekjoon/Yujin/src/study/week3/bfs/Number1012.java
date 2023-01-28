package study.week3.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Number1012 {
    static int[][] cabbageField;
    static boolean[][] cabbageCheck;
    static int width;
    static int height;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCaseNum = Integer.parseInt(br.readLine());


        for (int i = 0; i < testCaseNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            width = Integer.parseInt(st.nextToken());
            height = Integer.parseInt(st.nextToken());
            cabbageField = new int[width][height];
            cabbageCheck = new boolean[width][height];

            int cabbageCount = Integer.parseInt(st.nextToken());
            for (int j = 0; j < cabbageCount; j++) {
                st = new StringTokenizer(br.readLine());
                int spotWidth = Integer.parseInt(st.nextToken());
                int spotHeight = Integer.parseInt(st.nextToken());
                cabbageField[spotWidth][spotHeight] = 1;
            }

            int wormCount = 0;

            for (int j = 0; j < width; j++) {
                for (int k = 0; k < height; k++) {

                    if (cabbageField[j][k] == 1 && !cabbageCheck[j][k]) {
                        bfs(j, k);

                        wormCount += 1;
                    }
                }
            }
            System.out.println(wormCount);
        }
    }

    public static void bfs(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{startX, startY});

        cabbageCheck[startX][startY] = true;

        int[] X = {0, 0, -1, 1};
        int[] Y = {-1, 1, 0, 0};

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();

            for (int i = 0; i < 4; i++) {
                int x = poll[0] + X[i];
                int y = poll[1] + Y[i];


                if (x < 0 || x >= width || y < 0 || y >= height) {
                    continue;
                }

                if (cabbageField[x][y] == 1 && !cabbageCheck[x][y]) {
                    queue.offer(new int[]{x, y});

                    cabbageCheck[x][y] = true;
                }
            }
        }
    }
}
