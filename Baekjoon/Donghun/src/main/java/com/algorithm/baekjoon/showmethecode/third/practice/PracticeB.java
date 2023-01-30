package com.algorithm.baekjoon.showmethecode.third.practice;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class PracticeB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                array[n][m] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = solution(n, m, array);
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    public static int solution(int n, int m, int[][] array) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> mapA = new LinkedHashMap<>();
            Map<Integer, Integer> mapB = new LinkedHashMap<>();
            for (int j = 0; j < m; j++) {

            }
        }

        return answer;
    }
}
