package org.tfoc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class SolutionTest {

    @Test
    void shouldFindMaxInMixedArray() {
        // given
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};

        // when
        int result = Solution.maxSubArray(arr);

        // then
        assertEquals(6, result);
    }

    @Test
    void shouldFindMaxIn1Length() {
        // given
        int[] arr = new int[]{1};

        // when
        int result = Solution.maxSubArray(arr);

        // then
        assertEquals(1, result);
    }

    @Test
    void shouldFindMaxNegativeArray() {
        // given
        int[] arr = new int[]{-2,-1,-3,-1,-2,-4};

        // when
        int result = Solution.maxSubArray(arr);

        // then
        assertEquals(-1, result);
    }
}