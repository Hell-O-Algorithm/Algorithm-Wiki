package com.algorithm.baekjoon.sort.merge;

import java.io.*;

public class No2751 {
    static int[] listA, listTmp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        listA = new int[n];
        listTmp = new int[n];

        for (int i = 0; i < n; i++) {
            listA[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(0, listA.length - 1);
        for (int i = 0; i < listA.length; i++) {
            bw.write(listA[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static void mergeSort(int indexStart, int indexEnd) {
        if (indexEnd - indexStart < 1) {
            return;
        }
        int indexMiddle = indexStart + (indexEnd - indexStart) / 2;
        mergeSort(indexStart, indexMiddle);
        mergeSort(indexMiddle + 1, indexEnd);
        System.arraycopy(listA, indexStart, listTmp, indexStart, indexEnd - indexStart + 1);
        int k = indexStart;
        int indexA = indexStart; // 첫번째 그룹의 시작점
        int indexB = indexMiddle + 1; // 두번째 그룹의 시작점
        while (indexA <= indexMiddle && indexB <= indexEnd) { // 두 그룹을 Merge 해주는 로직
            if (listTmp[indexA] > listTmp[indexB]) {
                listA[k] = listTmp[indexB];
                k++;
                indexB++;
            } else {
                listA[k] = listTmp[indexA];
                k++;
                indexA++;
            }
        }
        // 한쪽 그룹이 모두 선택된 후 남아있는 값 정리하기
        while (indexA <= indexMiddle) {
            listA[k] = listTmp[indexA];
            k++;
            indexA++;
        }
        while (indexB <= indexEnd) {
            listA[k] = listTmp[indexB];
            k++;
            indexB++;
        }
    }
}
