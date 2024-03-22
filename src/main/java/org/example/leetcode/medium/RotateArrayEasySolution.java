package org.example.leetcode.medium;

import java.util.Arrays;

public class RotateArrayEasySolution {
    /**
    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]
    **/
    public void rotate(int[] nums, int k) {

        int [] startChunk = Arrays.copyOfRange(nums, 0, nums.length - k);
        int [] endChunk = Arrays.copyOfRange(nums, nums.length - k, nums.length);

        int i = 0;
        for (; i < endChunk.length; i++) {
            nums[i] = endChunk[i];
        }

        for (int j = 0; j < startChunk.length; j++, i++) {
            nums[i] = startChunk[j];
        }
    }

}
