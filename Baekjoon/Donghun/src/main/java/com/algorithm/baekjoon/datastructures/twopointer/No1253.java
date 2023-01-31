package com.algorithm.baekjoon.datastructures.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[] arrayN = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arrayN[i] = Integer.parseInt(st.nextToken());
        }

        int answer = solution(n, arrayN);
        System.out.println(answer);
    }

    public static int solution(int n, int[] arrayN) {
        Arrays.sort(arrayN);
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int indexA = 0;
            int indexB = n - 1;
            int findNum = arrayN[i];
            while (indexA < indexB) {
                int sum = arrayN[indexA] + arrayN[indexB];
                if (sum == findNum) {
                    if (indexA != i && indexB != i) { // aNum[i]와 aNum[j]가 자기 자신을 가르키는 것이 아닌지 확인
                        answer++;
                        break;
                    } else if (indexA == i) {
                        indexA++;
                    } else if (indexB == i) {
                        indexB--;
                    }
                } else if (sum < findNum) {
                    indexA++;
                } else {
                    indexB--;
                }
            }
        }
        return answer;
    }
}
