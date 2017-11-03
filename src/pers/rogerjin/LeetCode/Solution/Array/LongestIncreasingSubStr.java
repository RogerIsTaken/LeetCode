package pers.rogerjin.LeetCode.Solution.Array;

public class LongestIncreasingSubStr {
    public int findLengthOfLCIS(int[] nums) {
        int archor = 0;
        int maxLen = 0;
        if (nums.length < 2) {
            return nums.length;
        } else {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] <= nums[i - 1]) {
                    maxLen = Math.max(maxLen, i - archor);
                    archor = i;
                } else if (i == nums.length - 1) { //consider that it reachs the end of array
                    maxLen = Math.max(maxLen, i - archor + 1);
                }
            }
            return maxLen;
        }
    }


    public static void main(String[] args) {
        LongestIncreasingSubStr l = new LongestIncreasingSubStr();
        int[] nums = {1, 3, 5, 4, 2, 3, 4, 5};
        int maxLen = l.findLengthOfLCIS(nums);
    }
}
