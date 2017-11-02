package pers.rogerjin.LeetCode.Solution.Math;

public class ReverseInteger {
    public static int reserve(int x) {
        String intStr = Integer.toString(x);
        String reverseIntStr = "";
        StringBuilder sb = new StringBuilder("");
        int reserveInt = 0;
        long reserveIntL = 0;
        if(intStr.startsWith("-")) {
            sb.append(intStr.substring(1));
            sb.append("-");
        } else {
            sb.append(intStr.substring(0,intStr.length()));
        }
        sb.reverse();
        reserveIntL = Long.parseLong(sb.toString());
        //check overflow
        if((reserveIntL>=Integer.MIN_VALUE)&&(reserveIntL<=Integer.MAX_VALUE)){
            reserveInt = (int) reserveIntL;
        }
        return reserveInt;
    }

    public static void main(String args[]) {
        int testInt = -1234567;
        int reserveI = reserve(testInt);
        System.out.println(reserveI);
    }
}
