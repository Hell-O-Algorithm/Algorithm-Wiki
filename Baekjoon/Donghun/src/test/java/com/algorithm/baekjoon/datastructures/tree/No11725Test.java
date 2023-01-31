package com.algorithm.baekjoon.datastructures.tree;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class No11725Test {

    @Test
    void 테케1() {
        int sizeN = 7;
        List<List<Integer>> nodeInfo = List.of(List.of(), List.of(6, 4), List.of(4), List.of(6, 5), List.of(1, 2, 7), List.of(3), List.of(1, 3), List.of(4));
        int[] expected = {4, 6, 1, 3, 1, 4};
        int[] result = null;
        assertThat(result).isEqualTo(expected);
    }

}