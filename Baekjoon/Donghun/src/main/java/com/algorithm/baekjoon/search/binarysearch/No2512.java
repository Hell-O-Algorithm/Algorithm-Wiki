package com.algorithm.baekjoon.search.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No2512 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arrayN = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arrayN[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        int answer = solution(n, arrayN, m);
        System.out.println(answer);
    }

    public static int solution(int sizeN, int[] arrayN, int m) {
        if (sizeN == m) {
            return 1;
        }
        if (Arrays.stream(arrayN).sum() <= m) {
            return Arrays.stream(arrayN).max().getAsInt();
        }
        int answer = 0;
        int index = 0;
        int min = 0;
        int mid = 0;
        int max = Arrays.stream(arrayN).max().getAsInt();
        Arrays.sort(arrayN);
        /*
        for (int i = 0; i < sizeN; i++) {
            int n = arrayN[i];
            if (sizeN * n > m) {
                min = arrayN[i - 1];
                max = arrayN[i];
                index = i;
                break;
            }
        }
        for (int i = 0; i < index; i++) {
            sum = sum + arrayN[i];
        }
        m = m - sum;
        */
        while (min < max) {
            int sum = 0;
            mid = (min + max) / 2;
            for (int i = 0; i < arrayN.length; i++) {
                if (arrayN[i] > mid) {
                    sum = sum + mid;
                } else {
                    sum = sum + arrayN[i];
                }
            }
            if (sum > m) {
                max = mid - 1;
            } else {
                min = mid;
            }
        }
        return max;
    }
}
