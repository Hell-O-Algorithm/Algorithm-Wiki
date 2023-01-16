package com.example.demo.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1920 {
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

        System.out.println(cnt);
    }
}
