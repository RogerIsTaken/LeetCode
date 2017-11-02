package pers.rogerjin.LeetCode.Solution.Array;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int lowIndex = 0;
        int middleIndex = 0;
        int highIndex = nums.length - 1;
        while (lowIndex <= highIndex) {
            middleIndex = (lowIndex + highIndex) / 2;
            if (target == nums[middleIndex]) {
                return middleIndex;
            } else if (target > nums[middleIndex]) {
                lowIndex = middleIndex + 1;
            } else {
                highIndex = middleIndex - 1;
            }

        }
        return lowIndex;
    }
}


