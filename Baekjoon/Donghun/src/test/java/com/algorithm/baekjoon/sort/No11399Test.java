package com.algorithm.baekjoon.sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class No11399Test {

    @Test
    void solution() {
        //given
        int n = 5;
        List<Integer> listA = new ArrayList<>(List.of(3, 1, 4, 3, 2));
        int answer = 32;
        //when
        int result = No11399.solution(n, listA);
        //then
        assertThat(result).isEqualTo(answer);
        log.info("result = {}", result);
    }
}