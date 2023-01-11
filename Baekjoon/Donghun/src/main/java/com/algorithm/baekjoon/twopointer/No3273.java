package com.algorithm.baekjoon.twopointer;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class No3273 {
    public static void main(String[] args) throws IOException {
        List<Integer> listA = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            listA.add(Integer.parseInt(st.nextToken()));
        }
        int x = Integer.parseInt(br.readLine());

        int answer = twoPointer(listA, x);
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    public static int twoPointer(List<Integer> listA, int x) {
        listA.sort(Comparator.naturalOrder());
        int indexA = 0;
        int indexB = listA.size() - 1;
        int answer = 0;
        while (indexA < indexB) {
            int sum = listA.get(indexA) + listA.get(indexB);
            if (sum > x) {
                indexB--;
            } else if (sum < x) {
                indexA++;
            } else {
                answer++;
                indexA++;
                indexB--;
            }
        }
        return answer;
    }
}
