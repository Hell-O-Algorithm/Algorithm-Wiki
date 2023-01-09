package com.algorithm.programmers.sort;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

@Component
public class No42747 {
    public void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] citations = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            citations[i] = Integer.parseInt(st.nextToken());
        }

        int answer = solution(citations);
        System.out.println("answer = " + answer);
    }

    public int solution(int[] citations) {
        int answer = citations.length;
        Arrays.sort(citations);
        for (int citation : citations) {
            if (citation < answer) {
                answer--;
            }
        }
        return answer;
    }
}
