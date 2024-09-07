package com.ArrayOperation;

import java.util.Arrays;
import java.util.List;

public class TwoSum {
    /*
     * 1. Two Sum
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     */
    public static List<Integer> twoSum(int[] nums, int target) {
        int size = nums.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums[i] + nums[j] == target) {
                    return Arrays.asList(nums[i], nums[j]);
                }
            }
        }
        return Arrays.asList(-1, -1);
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 26;
        List<Integer> result = twoSum(nums, target);
        System.out.println(result);
    }
}
