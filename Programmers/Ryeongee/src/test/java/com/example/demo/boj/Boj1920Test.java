package com.example.demo.boj;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Boj1920Test {
    @Test
    void testBoj() {
//    given
        String exInput = "5\n" + "4 1 5 2 3\n" + "5\n" + "1 3 7 9 5";
        String exOutput = "1\n" + "1\n" + "0\n" + "0\n" + "1";
        int N = 5;
        int[] A = new int[]{4, 1, 5, 2, 3};
        int M = 5;
        int[] B = new int[]{1, 3, 7, 9, 5};
//    when
        int[] answerArr = new int[B.length];
        Arrays.sort(A);
        for (int i = 0; i < B.length; i++) {
            int target = B[i];
            int answer = binarySearch(A, target);
            answerArr[i] = answer;
        }
//    then
        String solution = loadSolution(answerArr);
        org.assertj.core.api.Assertions.assertThat(solution).isEqualTo(exOutput);
    }

    private static String loadSolution(int[] answerArr) {
        String solution = null;
        for (int answer : answerArr) {
            System.out.println(answer);
            solution += answer + "\n";
        }
        return solution;
    }

    public static int binarySearch(int[] searchArray, int target) {
        int answer = 0;
        int center = searchArray.length / 2;
        while ((center > 0 && center < searchArray.length - 1) || searchArray[center] == target) {
            if (searchArray[center] == target) {
                answer = target;
                return 1;
            } else if (searchArray[center] < target) {
                searchArray = Arrays.copyOfRange(searchArray, center, searchArray.length - 1);
            } else if (searchArray[center] > target) {
                searchArray = Arrays.copyOfRange(searchArray, 0, center);
            }
            center /= 2;
        }
        return 0;
    }
}