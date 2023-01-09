package com.algorithm.baekjun.sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class No11931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> listA = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            listA.add(Integer.valueOf(br.readLine()));
        }
        solution(listA);
        for (Integer a : listA) {
            bw.write(a + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static void solution(List<Integer> listA) {
        listA.sort(Comparator.reverseOrder());
    }
}
