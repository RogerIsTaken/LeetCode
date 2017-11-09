package pers.rogerjin.LeetCode.Solution.Array;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        String xStr = Integer.toBinaryString(x);
        String yStr = Integer.toBinaryString(y);
        //to make sure xStr's length is less than yStr's
        if (xStr.length() > yStr.length()) {
            String tmp = yStr;
            yStr = xStr;
            xStr = tmp;
        }
        int distance = 0;
        for (int i = 0; i < xStr.length(); i++) {
            if (xStr.charAt(xStr.length() - i - 1) != yStr.charAt(yStr.length() - i - 1)) {
                ++distance;
            }
        }
        for (int j = xStr.length(); j < yStr.length(); j++) {
            if (yStr.charAt(yStr.length() - j - 1) == '1') {
                ++distance;
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        HammingDistance hd = new HammingDistance();
        int distance = hd.hammingDistance(x, y);
        System.out.println(distance);
    }
}
