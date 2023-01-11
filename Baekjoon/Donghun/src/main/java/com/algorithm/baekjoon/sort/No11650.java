package com.algorithm.baekjoon.sort;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] coordinate = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            coordinate[i][0] = x;
            coordinate[i][1] = y;
        }
        solution(coordinate);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                bw.write(String.valueOf(coordinate[i][j]) + ' ');
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    public static void solution(int[][] coordinate) {
        Arrays.sort(coordinate, (o1, o2) -> o1[0] != o2[0] ? o1[0] - o2[0] : o1[1] - o2[1]);
    }
}
