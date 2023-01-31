package com.algorithm.baekjoon.binarysearch;

import com.algorithm.baekjoon.search.binarysearch.No6236;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class No6236Test {

    @Test
    void 테케1() {
        //given
        int n = 7;
        int m = 5;
        int[] listN = {100, 400, 300, 100, 500, 101, 400};
        int answer = 500;
        //when
        int result = No6236.solution(n, m, listN);
        //then
        assertThat(result).isEqualTo(answer);
        log.info("result={}", result);
    }

    @Test
    void 테케2() {
        //given
        int n = 10;
        int m = 1;
        int[] listN = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        int answer = 5500;
        //when
        int result = No6236.solution(n, m, listN);
        //then
        assertThat(result).isEqualTo(answer);
        log.info("result={}", result);
    }

    @Test
    void 테케3() {
        //given
        int n = 10;
        int m = 2;
        int[] listN = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        int answer = 2800;
        //when
        int result = No6236.solution(n, m, listN);
        //then
        assertThat(result).isEqualTo(answer);
        log.info("result={}", result);
    }
}