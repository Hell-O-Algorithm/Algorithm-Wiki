package com.algorithm.baekjun.sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class No1026Test {

    @Test
    void methodBySort_테케1() {
        //given
        int n = 5;
        List<Integer> listA = new ArrayList<>(List.of(1, 1, 1, 6, 0));
        List<Integer> listB = new ArrayList<>(List.of(2, 7, 8, 3, 1));
        int answer = 18;
        //when
        int result = No1026.methodBySort(n, listA, listB);
        //then
        assertThat(result).isEqualTo(answer);
        log.info("result={}", result);
    }

    @Test
    void methodByMinMax_테케2() {
        //given
        int n = 3;
        List<Integer> listA = new ArrayList<>(List.of(1, 1, 3));
        List<Integer> listB = new ArrayList<>(List.of(10, 30, 20));
        int answer = 80;
        //when
        int result = No1026.methodBySort(n, listA, listB);
        //then
        assertThat(result).isEqualTo(answer);
        log.info("result={}", result);
    }

    @Test
    void methodByMinMax_테케3() {
        //given
        int n = 9;
        List<Integer> listA = new ArrayList<>(List.of(5, 15, 100, 31, 39, 0, 0, 3, 26));
        List<Integer> listB = new ArrayList<>(List.of(11, 12, 13, 2, 3, 4, 5, 9, 1));
        int answer = 528;
        //when
        int result = No1026.methodBySort(n, listA, listB);
        //then
        assertThat(result).isEqualTo(answer);
        log.info("result={}", result);
    }
}