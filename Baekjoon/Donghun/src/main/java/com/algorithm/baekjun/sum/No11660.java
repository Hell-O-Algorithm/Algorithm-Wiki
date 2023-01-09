package com.algorithm.baekjun.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] aNum = new int[n][n];
        int[][] sNum = new int[n + 1][n + 1];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                aNum[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        sNum[1][1] = aNum[0][0];
        for (int i = 1; i < n; i++) {
            sNum[i + 1][1] = sNum[i][1] + aNum[i][0];
            sNum[1][i + 1] = sNum[1][i] + aNum[0][i];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                sNum[i + 1][j + 1] = sNum[i][j + 1] + sNum[i + 1][j] - sNum[i][j] + aNum[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int X1 = Integer.parseInt(st.nextToken());
            int Y1 = Integer.parseInt(st.nextToken());
            int X2 = Integer.parseInt(st.nextToken());
            int Y2 = Integer.parseInt(st.nextToken());

            System.out.println(sNum[X2][Y2] - sNum[X2][Y1 - 1] - sNum[X1 - 1][Y2] + sNum[X1 - 1][Y1 - 1]);


        }

    }
}
