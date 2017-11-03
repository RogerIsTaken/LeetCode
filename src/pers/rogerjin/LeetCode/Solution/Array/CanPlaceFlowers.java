package pers.rogerjin.LeetCode.Solution.Array;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int periodLenth = 0;
        int totalCount = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (i == 0 && flowerbed[i] == 0) {
                periodLenth += 1;
            }
            if (flowerbed[i] == 0) {
                ++periodLenth;
            } else {
                totalCount += Math.max(Math.ceil((periodLenth - 2) / 2.0), 0);
                periodLenth = 0;
            }
            if (i == (flowerbed.length - 1) && flowerbed[i] == 0) {
                periodLenth += 1;
                totalCount += Math.max(Math.ceil((periodLenth - 2) / 2.0), 0);
            }

        }
        if (totalCount >= n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        CanPlaceFlowers testCase = new CanPlaceFlowers();
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        boolean isTrue = testCase.canPlaceFlowers(flowerbed, n);
    }
}
