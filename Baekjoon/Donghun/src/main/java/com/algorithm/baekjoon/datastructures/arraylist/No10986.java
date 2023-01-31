package com.algorithm.baekjoon.datastructures.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] sNum = new long[n];
        long[] remain = new long[m];
        long cnt = 0;

        st = new StringTokenizer(br.readLine());
        sNum[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < n; i++) {
            sNum[i] = sNum[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            int remainder = (int) (sNum[i] % m);
            if (remainder == 0) {
                cnt++;
            }
            remain[remainder]++;
        }

        for (int i = 0; i < m; i++) {
            if (remain[i] > 1) {
                cnt += (remain[i] * (remain[i] - 1) / 2);
            }
        }

        System.out.println(cnt);
    }
}
