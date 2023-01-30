package com.algorithm.baekjoon.math;

import java.util.Scanner;

public class No1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aScore = new int[n];
        for (int i = 0; i < n; i++) {
            aScore[i] = sc.nextInt();
        }

        double answer = solution(n, aScore);

        System.out.println(answer);

    }

    public static double solution(int n, int[] aScore) {
        long m = 0;
        double sum = 0;
        for (int j : aScore) {
            m = Math.max(m, j);
            sum += j;
        }
        return sum * 100 / m / n;
    }
}
