package pers.rogerjin.LeetCode.Solution.Array;

import java.util.ArrayList;

public class MaximumSwap {
    public int maximumSwap(int num) {
        ArrayList<Integer> array = new ArrayList<>();
        String temp = String.valueOf(num);
        int[] digits = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            digits[i] = temp.charAt(i) - '0';
        }
        if (digits.length < 2) {
            return num;
        } else {
            int swapIndex = 0;
            for (int i = 1; i < temp.length(); i++) {
                if (digits[i - 1] < digits[i]) {
                    swapIndex = i;
                    for (int j = swapIndex; j < temp.length(); j++) {
                        if (digits[swapIndex] <= digits[j]) {
                            swapIndex = j;
                        }
                    }
                    break;
                }
            }
            for (int j = 0; j < swapIndex; j++) {
                if (digits[j] < digits[swapIndex]) {
                    StringBuilder sb = new StringBuilder(temp);
                    sb.setCharAt(j, (char) (digits[swapIndex] + '0'));
                    sb.setCharAt(swapIndex, (char) (digits[j] + '0'));
                    temp = sb.toString();
                    break;
                }
            }
        }
        return Integer.valueOf(temp);
    }

    public static void main(String[] args) {
        MaximumSwap ms = new MaximumSwap();
        int num = 12335431;
        int ret = ms.maximumSwap(num);
        System.out.println(ret);
    }
}
