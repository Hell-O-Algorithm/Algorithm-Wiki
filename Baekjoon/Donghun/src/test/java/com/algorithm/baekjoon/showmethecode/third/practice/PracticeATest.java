package com.algorithm.baekjoon.showmethecode.third.practice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PracticeATest {

    @Test
    void 테케1() {
        int n = 1;
        int expected = 1;
        int result = PracticeA.solution(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 테케2() {
        int n = 2;
        int expected = 4;
        int result = PracticeA.solution(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 테케3() {
        int n = 10;
        int expected = 87;
        int result = PracticeA.solution(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 테케4() {
        int n = 70;
        int expected = 4065;
        int result = PracticeA.solution(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 테케5() {
        int n = 10000;
        int expected = 82256014;
        int result = PracticeA.solution(n);
        assertThat(result).isEqualTo(expected);
    }
}