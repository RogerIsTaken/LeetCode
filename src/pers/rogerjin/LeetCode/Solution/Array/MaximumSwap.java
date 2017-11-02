package pers.rogerjin.LeetCode.Solution.Array;

import java.util.ArrayList;

public class MaximumSwap {
    public int maximumSwap(int num) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int tmp = num;
        int currentDigit = 0;
        int currentIndex = 0;
        int swapIndex = 0;
        do {
            currentDigit = tmp % 10;
            array.add(currentDigit);
            if (array.get(swapIndex) < currentDigit) {
                swapIndex = currentIndex;
            }
            ++currentIndex;
            tmp = tmp / 10;
        } while (tmp > 0);
        //not need swap
        if (swapIndex == array.size() - 1) {
            return num;
        } else {
            int swapDigit = array.get(swapIndex);
            array.set(swapIndex, array.get(array.size() - 1));
            array.set(array.size() - 1, swapDigit);
            int returnNum = 0;
            for (int i = array.size() - 1; i >= 0; i--) {
                returnNum = returnNum * 10 + array.get(i);
            }
            return returnNum;
        }

    }
}
