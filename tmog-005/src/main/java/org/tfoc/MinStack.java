package org.tfoc;

/**
 * MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack()
 * obj.push(val)
 * obj.pop()
 * int param_3 = obj.top()
 * int param_4 = obj.getMin()
 *
 * CONSTRAINTS: Methods pop, top and getMin operations will always be called on non-empty stacks.
 */
public class MinStack {

    private static final int MIN_CAPACITY = 10;

    private int[] stack;
    private int topIdx = -1;
    private int minIdx;

    public MinStack() {
        stack = new int[MIN_CAPACITY];
    }

    public void push(int val) {
        if (topIdx == stack.length - 1) {
            resize();
        }

        stack[++topIdx] = val;

        if (val < stack[minIdx]) {
            minIdx = topIdx;
        }
    }

    public void pop() {
        topIdx--;
        if (topIdx < minIdx) recalculateMin();
    }

    public int top() {
        return stack[topIdx];
    }

    public int getMin() {
        return stack[minIdx];
    }

    private void resize() {
        int[] newStack = new int[stack.length << 1];
        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }

        stack = newStack;
    }

    private void recalculateMin() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= topIdx; i++) {
            if (min >= stack[i]) {
                min = stack[i];
                minIdx = i;
            }
        }
    }

}
