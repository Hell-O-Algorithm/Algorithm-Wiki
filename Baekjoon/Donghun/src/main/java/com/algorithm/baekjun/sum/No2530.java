package com.algorithm.baekjun.sum;

import java.util.Scanner;

public class No2530 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int cooking_time = scanner.nextInt();

        int addSec = cooking_time % 60;
        int addMin = (cooking_time / 60) % 60;
        int addHour = cooking_time / 3600;

        s = s + addSec;
        if (s >= 60) {
            m = m + (s / 60);
            s = s % 60;

        }

        m = m + addMin;
        if (m >= 60) {
            h = h + (m / 60);
            m = m % 60;

        }

        h = h + addHour;
        if (h >= 24) {
            h = h % 24;
        }

        System.out.printf("%d %d %d", h, m, s);
    }
}
