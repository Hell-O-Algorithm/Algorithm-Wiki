package com.algorithm.baekjoon.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int answer = 0;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[] aNum = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            aNum[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(aNum);

        for (int k = 0; k < n; k++) {
            int i = 0;
            int j = n - 1;
            int Find = aNum[k];
            while (i < j) {
                int sum = aNum[i] + aNum[j];
                if (sum == Find) {
                    if (i != k && j != k) { // aNum[i]와 aNum[j]가 자기 자신을 가르키는 것이 아닌지 확인
                        answer++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    }
                } else if (sum < Find) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        System.out.println(answer);
    }
}
