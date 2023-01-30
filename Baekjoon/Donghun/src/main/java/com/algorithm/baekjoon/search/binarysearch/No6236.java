package com.algorithm.baekjoon.search.binarysearch;

import java.io.*;
import java.util.StringTokenizer;

public class No6236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sizeN = Integer.parseInt(br.readLine());
        int sizeM = Integer.parseInt(br.readLine());
        int[] arrayN = new int[sizeN];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < sizeN; i++) {
            arrayN[i] = Integer.parseInt(st.nextToken());
        }
        int answer = solution(sizeN, sizeM, arrayN);
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    public static int solution(int sizeN, int sizeM, int[] arrayN) {
//        int min = Arrays.stream(arrayN).max().getAsInt();
//        int max = Arrays.stream(arrayN).sum();
        int min = 1;
        for (int i : arrayN) {
            min = Math.max(min, i);
        }
        int max = (int) 1e9;
        while (min < max) {
            int mid = (min + max) / 2;
            int cnt = getCount(mid, arrayN);
            if (cnt > sizeM) {
                min = mid + 1;
            } else {
                max = mid;
            }

        }
        return min;
    }

    private static int getCount(int mid, int[] arrayN) {
        int current = 0;
        int count = 0;
        for (int n : arrayN) {
            if (current < n) {
                current = mid;
                count++;
            }
            current = current - n;
        }
        return count;
    }
}
