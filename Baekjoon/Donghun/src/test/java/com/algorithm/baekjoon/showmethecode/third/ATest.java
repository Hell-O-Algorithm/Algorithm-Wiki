package com.algorithm.baekjoon.showmethecode.third;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ATest {

    @Test
    void 테케1() {
        int n = 5;
        int[] arrayN = {1, 1, 2, 1, 2};
        int expected = 2;
        int result = A.solution(n, arrayN);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 테케2() {
        int n = 1;
        int[] arrayN = {1};
        int expected = 1;
        int result = A.solution(n, arrayN);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 테케3() {
        int n = 2;
        int[] arrayN = {1, 2};
        int expected = 1;
        int result = A.solution(n, arrayN);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 테케4() {
        int n = 10;
        int[] arrayN = {1, 1, 2, 1, 1, 2, 1, 1, 1, 1};
        int expected = 6;
        int result = A.solution(n, arrayN);
        assertThat(result).isEqualTo(expected);
    }
}