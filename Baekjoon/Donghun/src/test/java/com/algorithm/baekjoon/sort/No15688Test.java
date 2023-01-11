package com.algorithm.baekjoon.sort;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class No15688Test {

    @Test
    void 테케1() {
        //given
        int[] array = {5, 4, 3, 2, 1};
        int[] answer = {1, 2, 3, 4, 5};
        //when
        No15688.solution(array);
        //then
        Assertions.assertThat(array).isEqualTo(answer);
        for (int i : array) {
            log.info("i = {}", i);
        }
    }

    @Test
    void 테케2() {
        //given
        int[] array = {1, 2, 1, 2, 1};
        int[] answer = {1, 1, 1, 2, 2};
        //when
        No15688.solution(array);
        //then
        Assertions.assertThat(array).isEqualTo(answer);
        for (int i : array) {
            log.info("i = {}", i);
        }
    }

    @Test
    void 테케3() {
        //given
        int[] array = {1, 2, 3, 4, 5};
        int[] answer = {1, 2, 3, 4, 5};
        //when
        No15688.solution(array);
        //then
        Assertions.assertThat(array).isEqualTo(answer);
        for (int i : array) {
            log.info("i = {}", i);
        }
    }

    @Test
    void 테케4() {
        //given
        int[] array = {0, 0, 0, 0, 0, 0};
        int[] answer = {0, 0, 0, 0, 0, 0};
        //when
        No15688.solution(array);
        //then
        Assertions.assertThat(array).isEqualTo(answer);
        for (int i : array) {
            log.info("i = {}", i);
        }
    }
}