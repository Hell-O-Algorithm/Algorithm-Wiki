package com.algorithm.baekjun.average;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class No1546Test {

    @Test
    void 테케1() {
        //given
        int n = 3;
        int[] score = new int[]{40, 80, 60};
        double answer = 75.0;
        //when
        double result = No1546.solution(n, score);
        //then
        Assertions.assertThat(result).isEqualTo(answer);
        log.info("result = {}", result);
    }

    @Test
    void 테케2() {
        //given
        int n = 3;
        int[] score = new int[]{10, 20, 30};
        double answer = (double) 200 / 3;
        //when
        double result = No1546.solution(n, score);
        //then
        Assertions.assertThat(result).isEqualTo(answer);
        log.info("result = {}", result);
    }

    @Test
    void 테케3() {
        //given
        int n = 4;
        int[] score = new int[]{1, 100, 100, 100};
        double answer = 75.25;
        //when
        double result = No1546.solution(n, score);
        //then
        Assertions.assertThat(result).isEqualTo(answer);
        log.info("result = {}", result);
    }

    @Test
    void 테케4() {
        //given
        int n = 5;
        int[] score = new int[]{1, 2, 4, 8, 16};
        double answer = 38.75;
        //when
        double result = No1546.solution(n, score);
        //then
        Assertions.assertThat(result).isEqualTo(answer);
        log.info("result = {}", result);
    }

    @Test
    void 테케5() {
        //given
        int n = 2;
        int[] score = new int[]{3, 10};
        double answer = 65.0;
        //when
        double result = No1546.solution(n, score);
        //then
        Assertions.assertThat(result).isEqualTo(answer);
        log.info("result = {}", result);
    }

    @Test
    void 테케6() {
        //given
        int n = 4;
        int[] score = new int[]{10, 20, 0, 100};
        double answer = 32.5;
        //when
        double result = No1546.solution(n, score);
        //then
        Assertions.assertThat(result).isEqualTo(answer);
        log.info("result = {}", result);
    }

    @Test
    void 테케7() {
        //given
        int n = 1;
        int[] score = new int[]{50};
        double answer = 100.0;
        //when
        double result = No1546.solution(n, score);
        //then
        Assertions.assertThat(result).isEqualTo(answer);
        log.info("result = {}", result);
    }

    @Test
    void 테케8() {
        //given
        int n = 9;
        int[] score = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90};
        double answer = 55.55555555555556;
        //when
        double result = No1546.solution(n, score);
        //then
        Assertions.assertThat(result).isEqualTo(answer);
        log.info("result = {}", result);
    }
}