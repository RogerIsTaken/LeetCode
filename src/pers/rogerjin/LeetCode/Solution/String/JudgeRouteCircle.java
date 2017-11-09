package pers.rogerjin.LeetCode.Solution.String;

public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        int xOffset = 0;
        int yOffset = 0;
        boolean isTrue = false;
        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            if (move == 'L') {
                --xOffset;
            } else if (move == 'R') {
                ++xOffset;
            } else if (move == 'U') {
                ++yOffset;
            } else if (move == 'D') {
                --yOffset;
            }
        }
        if (xOffset == 0 && yOffset == 0) {
            isTrue = true;
        } else {
            isTrue = false;
        }
        return isTrue;
    }
}
