package com.algorithm.baekjoon.binarysearch;

import com.algorithm.baekjoon.search.binarysearch.No2512;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class No2512Test {

    @Test
    void 테케1() {
        int n = 4;
        int[] arrayN = {120, 110, 140, 150};
        int m = 485;
        int result = No2512.solution(n, arrayN, m);
        int expected = 127;
        assertThat(result).isEqualTo(expected);
        log.info("expected = {}", expected);
    }

    @Test
    void 테케2() {
        int n = 5;
        int[] arrayN = {70, 80, 30, 40, 100};
        int m = 450;
        int result = No2512.solution(n, arrayN, m);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
        log.info("expected = {}", expected);
    }
}