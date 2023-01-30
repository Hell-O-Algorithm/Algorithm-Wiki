package com.algorithm.baekjoon.showmethecode.third;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arrayN = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arrayN[i] = Integer.parseInt(st.nextToken());
        }

        int answer = solution(n, arrayN);
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    public static int solution(int n, int[] arrayN) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int[] partial = Arrays.copyOfRange(arrayN, i, j + 1);
                List<Integer> partialList = Arrays.stream(partial).boxed().collect(Collectors.toList());
                int enlightenment = Math.abs(Collections.frequency(partialList, 2) - Collections.frequency(partialList, 1));
                if (enlightenment > answer) {
                    answer = enlightenment;
                }
            }
        }
        return answer;
    }
}
