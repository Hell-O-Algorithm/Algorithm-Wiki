package com.algorithm.baekjoon.search.binarysearch;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class No6988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arrayA = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arrayA[i] = (Integer.parseInt(st.nextToken()));
        }
        int answer = solution(n, arrayA);
        bw.write(answer);
        bw.flush();
        bw.close();
    }

    public static int solution(int n, int[] arrayA) {
        Set<Integer> indexSet = new HashSet<>();
        int indexA = 0;
        int indexB = arrayA.length - 1;
        binarySearch(arrayA, indexSet, indexA, indexB);
        int answer = 0;
        for (Integer index : indexSet) {
            answer = answer + arrayA[index];
        }
        return answer;
    }

    private static void binarySearch(int[] arrayA, Set<Integer> indexSet, int indexA, int indexB) {
        if (indexB - indexA == 1) {
            return;
        }
        int gap = arrayA[indexB] - arrayA[indexA];
        if (gap % 2 == 0) {
            gap = gap / 2;
        } else {
            gap = gap / 3;
        }
        int expected = arrayA[indexA] + gap;
        int indexExpected = Arrays.binarySearch(arrayA, indexA, indexB, expected);
        if (indexExpected >= 0) {
            indexSet.add(indexA);
            indexSet.add(indexB);
            indexSet.add(indexExpected);
            binarySearch(arrayA, indexSet, indexA, indexExpected);
            binarySearch(arrayA, indexSet, indexExpected, indexB);
        }
    }
}
