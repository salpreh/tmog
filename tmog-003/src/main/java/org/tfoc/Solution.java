package org.tfoc;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int[] sums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = 0; j <= i; j++) {
                sums[j] += num;
                if (sums[j] > max) max = sums[j];
            }
        }

        return max;
    }
}
