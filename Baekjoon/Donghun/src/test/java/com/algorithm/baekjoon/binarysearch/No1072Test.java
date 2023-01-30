package com.algorithm.baekjoon.binarysearch;

import com.algorithm.baekjoon.search.binarysearch.No1072;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class No1072Test {

    @Test
    void 테케1() {
        int x = 10;
        int y = 8;
        int expected = 1;
        long result = No1072.solution(x, y);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 테케2() {
        int x = 100;
        int y = 80;
        int expected = 6;
        long result = No1072.solution(x, y);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 테케3() {
        int x = 47;
        int y = 47;
        int expected = -1;
        long result = No1072.solution(x, y);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 테케4() {
        int x = 99000;
        int y = 0;
        int expected = 1000;
        long result = No1072.solution(x, y);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 테케5() {
        int x = 1000000000;
        int y = 470000000;
        int expected = 19230770;
        long result = No1072.solution(x, y);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void 테케6() {
        int x = 100;
        int y = 99;
        int expected = -1;
        long result = No1072.solution(x, y);
        assertThat(result).isEqualTo(expected);
    }
}