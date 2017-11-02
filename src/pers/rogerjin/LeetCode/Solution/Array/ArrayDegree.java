package pers.rogerjin.LeetCode.Solution.Array;

public class ArrayDegree {
    public int findShortestSubArray(int[] nums) {
        //for each line,
        //recorder[i][0]:count
        //recorder[i][1]:beginIndex
        //recorder[i][2]:endIndex
        int[][] recorder = new int[50000][3];
        int degreeIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            recorder[nums[i]][0] = recorder[nums[i]][0] + 1;
            if (recorder[nums[i]][0]==1) {
                //the count==1 means that the begin index should change
                recorder[nums[i]][1] = i;
            }
            recorder[nums[i]][2] = i;
            if (recorder[nums[i]][0] > recorder[degreeIndex][0]) {
                degreeIndex = nums[i];
            } else if (recorder[nums[i]][0] == recorder[degreeIndex][0]) {
                if ((recorder[nums[i]][2] - recorder[nums[i]][1] + 1) < (recorder[degreeIndex][2] - recorder[degreeIndex][1] + 1)) {
                    degreeIndex = nums[i];
                }
            }
        }
        return recorder[degreeIndex][2] - recorder[degreeIndex][1] + 1;

    }
}
