package com.algorithm.baekjoon.forquestion;

import java.util.Scanner;

public class ForQuestion4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            //sum += i;
            sum = sum + i;
        }
        System.out.println(sum);
    }
}