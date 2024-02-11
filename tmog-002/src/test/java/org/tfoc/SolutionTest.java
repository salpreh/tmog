package org.tfoc;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class SolutionTest {

    @Test
    void shouldBeValid() {
        // given
        String input = "([(){}])";

        // when
        boolean result = Solution.isValid(input);

        // then
        assertTrue(result);
    }

    @Test
    void shouldNotBeValid() {
        // given
        String input = "([)]";

        // when
        boolean result = Solution.isValid(input);

        // then
        assertFalse(result);
    }

}