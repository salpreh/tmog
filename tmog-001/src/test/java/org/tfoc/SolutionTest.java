package org.tfoc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class SolutionTest {

    @Test
    void testSolution() {
        // given
        int[] input = new int[]{2, 7, 11, 15};

        // when
        int[] result = Solution.twoSum(input, 9);

        // then
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }
}