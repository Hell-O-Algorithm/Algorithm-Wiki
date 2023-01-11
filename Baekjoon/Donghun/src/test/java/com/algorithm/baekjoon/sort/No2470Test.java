package com.algorithm.baekjoon.sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class No2470Test {

    @Test
    void twoPointer() {
        //given
        int n = 5;
        ArrayList<Integer> values = new ArrayList<>(List.of(-2, 4, -99, -1, 98));
        String answer = "-99 98";
        //when
        String result = No2470.twoPointer(n, values);
        //then
        assertThat(result).isEqualTo(answer);
        log.info("result = {}", result);
    }
}