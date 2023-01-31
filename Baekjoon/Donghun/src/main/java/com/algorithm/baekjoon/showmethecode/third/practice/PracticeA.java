package com.algorithm.baekjoon.showmethecode.third.practice;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class PracticeA {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int answer = solution(n);
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            Set<Integer> setDivisor = new HashSet<>();
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    setDivisor.add(j);
                    setDivisor.add(i / j);
                }
            }
            for (Integer divisor : setDivisor) {
                answer = answer + divisor;
            }
        }
        return answer;
    }
}
