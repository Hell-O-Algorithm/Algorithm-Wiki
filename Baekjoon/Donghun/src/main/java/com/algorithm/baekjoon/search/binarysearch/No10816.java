package com.algorithm.baekjoon.search.binarysearch;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class No10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sizeN = Integer.parseInt(br.readLine());
        List<Integer> listN = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < sizeN; i++) {
            listN.add(Integer.parseInt(st.nextToken()));
        }
        int sizeM = Integer.parseInt(br.readLine());
        List<Integer> listM = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < sizeM; i++) {
            listM.add(Integer.parseInt(st.nextToken()));
        }
        List<Integer> answer = solution(sizeN, listN, sizeM, listM);
        StringBuilder sb = new StringBuilder();
        for (Integer integer : answer) {
            sb.append(integer).append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static List<Integer> solution(int sizeN, List<Integer> listN, int sizeM, List<Integer> arrayM) {
        List<Integer> answer = new ArrayList<>();
        listN.sort(Comparator.naturalOrder());
        for (int m : arrayM) {
            int upperBound = findUpperBound(listN, m);
            int lowerBound = findLowerBound(listN, m);
            answer.add(upperBound - lowerBound);
        }
        return answer;
    }

    private static int findLowerBound(List<Integer> listN, int m) {
        int indexA = 0;
        int indexB = listN.size();
        while (indexA < indexB) {
            int indexMid = (indexA + indexB) / 2;
            if (listN.get(indexMid) >= m) {
                indexB = indexMid;
            } else {
                indexA = indexMid + 1;
            }
        }
        return indexA;
    }

    private static int findUpperBound(List<Integer> listN, int m) {
        int indexA = 0;
        int indexB = listN.size();
        while (indexA < indexB) {
            int indexMid = (indexA + indexB) / 2;
            if (listN.get(indexMid) > m) {
                indexB = indexMid;
            } else {
                indexA = indexMid + 1;
            }
        }
        return indexA;
    }
}
