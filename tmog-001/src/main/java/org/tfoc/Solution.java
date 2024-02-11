package org.tfoc;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    public static int[] twoSum(int[] nums, int target) {

        int [] result = new int[2];
        boolean done = false;
        for (int i = 0; i < nums.length && !done; i++) {
            for (int j = i+1; j < nums.length && !done; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    done = true;
                }
            }
        }

        return result;
    }

}
