package com.algorithm.baekjun.sort;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class No11650Test {

    @Test
    void solution() {
        //given
        int[][] coordinates = {{3, 4}, {1, 1}, {1, -1}, {2, 2}, {3, 3}};
        int[][] answer = {{1, -1}, {1, 1}, {2, 2}, {3, 3}, {3, 4}};
        //when
        No11650.solution(coordinates);
        //then
        Assertions.assertThat(coordinates).isEqualTo(answer);
        for (int[] coordinate : coordinates) {
            log.info("coordinate = {}", coordinate);
        }
    }
}