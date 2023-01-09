package com.algorithm.programmers.sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@SpringBootTest
class No42747Test {

    @Autowired
    No42747 no42747;

    @Test
    void 테케1() {
        //given
        int[] citations = new int[]{3, 0, 6, 1, 5};
        int answer = 3;
        //when
        int result = no42747.solution(citations);
        //then
        assertThat(result).isEqualTo(answer);
        log.info("result = {}", result);
    }
}