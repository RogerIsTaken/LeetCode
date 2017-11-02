package pers.rogerjin.LeetCode.Solution.Array;

public class OneAndTwoChars {
    public boolean isOneBitCharacter(int[] bits) {
        if (bits.length == 1) {//pay attention,it's a special case
            return true;
        } else {
            if (bits[bits.length - 2] == 0) {
                return true;
            } else {
                int step = 0;
                int index = 0;
                while (index < bits.length) {
                    if (bits[index] == 1) {
                        step = 2;
                    } else {
                        step = 1;
                    }
                    index += step;
                }
                if (step==1) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
}

