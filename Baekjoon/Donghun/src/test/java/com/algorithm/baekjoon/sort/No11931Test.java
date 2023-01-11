package com.algorithm.baekjoon.sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class No11931Test {

    @Test
    void solution() {
        //given
        List<Integer> listA = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        ArrayList<Integer> answer = new ArrayList<>(List.of(5, 4, 3, 2, 1));
        //when
        No11931.solution(listA);
        //then
        assertThat(listA).isEqualTo(answer);
        for (Integer a : listA) {
            log.info("a = {}", a);
        }

    }
}