package com.algorithm.baekjoon.binarysearch;

import com.algorithm.baekjoon.search.binarysearch.No10816;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class No10816Test {

    @Test
    void 테케1() {
        int n = 10;
        List<Integer> listN = new ArrayList<>(List.of(6, 3, 2, 10, 10, 10, -10, -10, 7, 3));
        int m = 8;
        List<Integer> listM = new ArrayList<>(List.of(10, 9, -5, 2, 3, 4, 5, -10));
        List<Integer> expected = new ArrayList<>(List.of(3, 0, 0, 1, 2, 0, 0, 2));
        List<Integer> result = No10816.solution(n, listN, m, listM);
        assertThat(result).isEqualTo(expected);
        log.info("result = {}", result);
    }

    @Test
    void 테케2() {
        int n = 1;
        List<Integer> listN = new ArrayList<>(List.of(2));
        int m = 4;
        List<Integer> listM = new ArrayList<>(List.of(2, 2, 1, 1));
        List<Integer> expected = new ArrayList<>(List.of(1, 1, 0, 0));
        List<Integer> result = No10816.solution(n, listN, m, listM);
        assertThat(result).isEqualTo(expected);
        log.info("result = {}", result);
    }
}