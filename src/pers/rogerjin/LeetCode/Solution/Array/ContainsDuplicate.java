package pers.rogerjin.LeetCode.Solution.Array;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0) {
            return false;
        } else {
            HashSet<Integer> s = new HashSet<Integer>();
            for (int i = 0; i < nums.length; i++) {
                if (s.contains(nums[i])) {
                    return true;
                } else {
                    s.add(nums[i]);
                }
            }
            return false;
        }
    }
}
