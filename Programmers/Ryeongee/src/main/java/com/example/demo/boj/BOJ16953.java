package com.example.demo.boj;

import java.util.*;
import java.io.*;

public class BOJ16953 {
    public static long A;
    public static long B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        A = Long.parseLong(input[0]);
        B = Long.parseLong(input[1]);
        int answer = bfs();
        System.out.println(answer);
    }

    public static int bfs() {
        int count = 0;
        Queue<Long> queue = new LinkedList<>();
        queue.add(A);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                A = queue.poll();
                if (A == B) {
                    return count + 1;
                }
                if (A * 2 <= B) {
                    queue.add(A * 2);
                }
                if ((A * 10) + 1 <= B) {
                    queue.add(A * 10 + 1);
                }
            }
            count++;
        }
        return -1;
    }
}