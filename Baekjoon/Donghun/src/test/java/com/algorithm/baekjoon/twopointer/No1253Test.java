package com.algorithm.baekjoon.twopointer;

import com.algorithm.baekjoon.datastructures.twopointer.No1253;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class No1253Test {

    @Test
    void solution() {
        int n = 10;
        int[] arrayN = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expected = 8;
        int result = No1253.solution(n, arrayN);
        assertThat(result).isEqualTo(expected);
        log.info("result = {}", result);
    }
}