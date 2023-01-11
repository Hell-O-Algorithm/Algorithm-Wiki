package com.algorithm.baekjoon.twopointer;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class No3273Test {

    @Test
    void twoPointer() {
        //given
        List<Integer> listA = new ArrayList<>(List.of(5, 12, 7, 10, 9, 1, 2, 3, 11));
        int x = 13;
        int answer = 3;
        //when
        int result = No3273.twoPointer(listA, x);
        //then
        assertThat(result).isEqualTo(answer);
        log.info("result = {}", result);
    }
}