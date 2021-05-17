package com.ss.week1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author NickM13
 * @since 5/14/2021
 */
public class AssignmentFive {

    /**
     * Given an array of ints, determine whether it is possible to add a group of them together to
     * equal another number, with the constraint that any neighboring numbers of equal value must
     * be added either all at once or not at all.
     * @param index
     * @param nums
     * @param remaining
     * @return
     */
    public boolean groupSumClump(int index, int[] nums, int remaining) {
        if (remaining == 0) return true;
        if (remaining < 0 || index > nums.length - 1) return false;
        int lastNum = nums[index];
        int cumulative = 0;
        for (int i = index; i < nums.length; i++) {
            if (lastNum == nums[i]) {
                cumulative += lastNum;
            } else {
                if (groupSumClump(i, nums, remaining - cumulative)) {
                    return true;
                }
                lastNum = nums[i];
                cumulative = nums[i];
            }
        }
        if (cumulative > 0) {
            return groupSumClump(nums.length, nums, remaining - cumulative);
        }
        return false;
    }

}
