package com.algorithm.programmers.sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@SpringBootTest
class No42746Test {

    @Autowired
    No42746 no42746;

    @Test
    void 테케1() {
        //given
        int[] testCase1 = new int[]{6, 10, 2};
        String answer = "6210";
        //when
        String result = no42746.comparatorSort(testCase1);
        //then
        assertThat(result).isEqualTo(answer);
        log.info("result = {}", result);
    }

    @Test
    void 테케2() {
        //given
        int[] testCase2 = {3, 30, 34, 5, 9};
        String answer = "9534330";
        //when
        String result = no42746.comparatorSort(testCase2);
        //then
        assertThat(result).isEqualTo(answer);
        log.info("result = {}", result);
    }
}