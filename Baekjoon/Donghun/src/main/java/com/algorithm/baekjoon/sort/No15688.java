package com.algorithm.baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No15688 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arrayA = new int[n];
        for (int i = 0; i < n; i++) {
            arrayA[i] = Integer.parseInt(br.readLine());
        }
        solution(arrayA);
        for (int a : arrayA) {
            sb.append(a).append("\n");
        }
        System.out.println(sb);
    }

    public static void solution(int[] arrayA) {
        Arrays.sort(arrayA);
    }
}
