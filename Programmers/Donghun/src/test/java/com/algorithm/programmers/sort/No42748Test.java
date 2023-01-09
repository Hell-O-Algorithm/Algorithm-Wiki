package com.algorithm.programmers.sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@SpringBootTest
class No42748Test {
    @Autowired
    No42748 no42748;

    static int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
    static int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
    static int[] answer = new int[]{5, 6, 3};

    @Test
    void fori() {
        //when
        int[] result = no42748.solution1(array, commands);
        //then
        assertThat(result).isEqualTo(answer);
        log.info("result = {}", result);
    }

    @Test
    void copyOfRange() {
        //when
        int[] result = no42748.solution2(array, commands);
        //then
        assertThat(result).isEqualTo(answer);
        log.info("result = {}", result);
    }
}