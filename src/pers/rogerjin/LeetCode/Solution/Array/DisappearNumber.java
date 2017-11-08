package pers.rogerjin.LeetCode.Solution.Array;

import java.util.ArrayList;
import java.util.List;

public class DisappearNumber {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> retList = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            //in this loop, nums[i] may be larger than n,so get the mod
            nums[(nums[i] - 1) % n] += n;
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n) {
                retList.add(i + 1);
            }
        }
        return retList;
    }

    public static void main(String[] agrs) {
        DisappearNumber dn = new DisappearNumber();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> l = dn.findDisappearedNumbers(nums);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }
}
