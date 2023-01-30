package com.algorithm.baekjoon.datastructures.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No1940 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int answer = 0;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] aNum = new int[n];
        for (int i = 0; i < n; i++) {
            aNum[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(aNum);

        int i = 0;
        int j = n - 1;
        while (i < j) {
            int sum = aNum[i] + aNum[j];
            if (sum < m) {
                i++;
            } else if (sum > m) {
                j--;
            } else {
                i++;
                j--;
                answer++;
            }
        }
        System.out.println(answer);
    }
}