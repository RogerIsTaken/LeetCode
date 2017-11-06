package pers.rogerjin.LeetCode.Solution.Array;

import java.util.ArrayList;

public class MaximumSwap {
    public int maximumSwap(int num) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        String temp = String.valueOf(num);
        int[] digits = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            digits[i] = temp.charAt(i) - '0';
        }
        if (digits.length < 2) {
            return num;
        } else {
            int swapIndex = 0;
            for (int i = 0; i < temp.length() - 1; i++) {
                if (digits[i] < digits[i + 1]) {
                    swapIndex = i + 1;
                    break;
                }
            }
            for (int j = 0; j < swapIndex; j++) {
                if (digits[j] < digits[swapIndex]) {
                    int swapDigit = 0;
                    swapDigit = digits[j];
                    digits[j] = digits[swapIndex];
                    digits[swapIndex] = swapDigit;
                    break;
                }
            }
            int num1 = 0;
            for (int i = 0; i < digits.length; i++) {
                num1 = num1 * 10 + digits[i];
            }
            return num1;
        }

    }

    public static void main(String[] args) {
        MaximumSwap ms = new MaximumSwap();
        int num = 2736;
        int ret = ms.maximumSwap(num);
        System.out.println(ret);
    }
}
