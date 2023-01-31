package com.algorithm.baekjoon.datastructures.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class No6416 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String input = br.readLine();
            if (input.contains("-1 -1")) {
                sb.append("  ");
                break;
            }
            sb.append(input).append("  ");
        }
        String s = sb.toString();
        String[] split = s.split("  0 0    ");
        for (String s1 : split) {
            String[] s2 = s1.split("  ");
            for (String s3 : s2) {
                String key = s3.substring(0, 1);
                String value = s3.substring(2, 3);
                System.out.println("key, value = " + key + "," + value);
            }
        }
    }

    public static String solution(Map<Integer, Integer> node) {
        return null;
    }
}
