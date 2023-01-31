package com.algorithm.baekjoon.search.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
//        long answer = solution(x, y);
        long answer = binarySearch(x, y);
        System.out.println(answer);
    }

    public static long solution(int x, int y) {
        long z = (100L * y) / x;
        if (z >= 99) {
            return -1;
        /*} else if (z == 0) {
            return (x - 100L * y) / (99);*/
        } else {
            long min = 1;
            long max = x;
            long mid;
            long result;
            while (min <= max) {
                mid = (min + max) / 2;
                result = 100L * (y + mid) / (x + mid);
                if (result > z) {
                    max = mid - 1;
                } else {
                    min = mid + 1;
                }
            }
            return min;
        }
    }

    public static long binarySearch(long x, long y) {
        long z = y * 100 / x;
        if (z >= 99) {
            return -1;
        }
        long start = 1;
        long end = x;
        long mid = 0, ratio = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            ratio = (y + mid) * 100 / (x + mid);

            if (ratio > z) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
