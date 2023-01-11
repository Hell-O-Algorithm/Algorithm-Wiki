package com.algorithm.baekjoon.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] sNum = new int[n];
        int cnt = 1;

        sNum[0] = 1;
        for (int i = 1; i < n; i++) {
            sNum[i] = sNum[i - 1] + i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sNum[j] - sNum[i] > n) {
                    break;
                } else {
                    if (sNum[j] - sNum[i] == n) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);

    }

}
