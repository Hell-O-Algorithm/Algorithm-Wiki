package com.algorithm.baekjoon.sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class No2470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            values.add(Integer.parseInt(st.nextToken()));
        }

        bw.write(twoPointer(n, values));
        bw.flush();
        bw.close();
    }

    public static String twoPointer(int n, ArrayList<Integer> values) {
        values.sort(Comparator.naturalOrder());

        if (values.get(0) >= 0) {
            return values.get(0) + " " + values.get(1);
        } else if (values.get(n - 1) <= 0) {
            return values.get(n - 2) + " " + values.get(n - 1);
        } else {
            int index1 = 0;
            int index2 = values.size() - 1;
            int i = index1;
            int j = index2;
            int value = Integer.MAX_VALUE;
            while (i < j) {
                int k = values.get(i) + values.get(j);
                if (Math.abs(k) < Math.abs(value)) {
                    index1 = i;
                    index2 = j;
                    value = k;
                }
                if (k > 0) {
                    j = j - 1;
                } else if (k < 0) {
                    i = i + 1;
                } else {
                    return values.get(index1) + " " + values.get(index2);
                }
            }
            return values.get(index1) + " " + values.get(index2);
        }
    }
}