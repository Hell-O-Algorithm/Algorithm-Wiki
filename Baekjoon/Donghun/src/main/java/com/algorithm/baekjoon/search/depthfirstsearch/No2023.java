package com.algorithm.baekjoon.search.depthfirstsearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2023 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 일의 자리 소수는 2 3 5 7 이므로 4개 수에서만 시작
        DFS(n, 2, 1);
        DFS(n, 3, 1);
        DFS(n, 5, 1);
        DFS(n, 7, 1);
    }

    static void DFS(int n, int number, int length) {
        if (length == n) {
            if (isPrime(number)) {
                System.out.println(number);
            }
            return;
        }
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) { // 짝수이면 더 이상 탐색할 필요가 없음
                continue;
            }
            if (isPrime(number * 10 + i)) { // 소수이면 재귀로 자리수를 늘려갑니다.
                DFS(n, number * 10 + i, length + 1);
            }
        }
    }

    static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++)
            if (num % i == 0)
                return false;
        return true;
    }
}
