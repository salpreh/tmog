package org.tfoc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Stack;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class MinStackTest {

    @Test
    void shouldChainOperationsCorrectly() {
        // given
        MinStack stack = new MinStack();

        // then
        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        assertEquals(-3, stack.getMin());

        stack.pop();
        assertEquals(0, stack.top());
        assertEquals(-2, stack.getMin());
    }

    @Test
    void shouldChainOperationsCorrectlyWhenEmptyingStack() {
        // given
        MinStack stack = new MinStack();

        stack.push(2147483646);
        stack.push(2147483646);
        stack.push(2147483647);

        assertEquals(2147483647, stack.top());
        stack.pop();
        assertEquals(2147483646, stack.getMin());
        stack.pop();
        assertEquals(2147483646, stack.getMin());

        stack.pop();
        stack.push(2147483647);
        assertEquals(2147483647, stack.top());
        assertEquals(2147483647, stack.getMin());

        stack.push(-2147483648);
        assertEquals(-2147483648, stack.top());
        assertEquals(-2147483648, stack.getMin());

        stack.pop();
        assertEquals(2147483647, stack.getMin());
    }
}