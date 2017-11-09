package pers.rogerjin.LeetCode.Solution.Array;

public class RepeatedSubarray {
    public int findLength(int[] a, int[] b) {
        int len1 = a.length;
        int len2 = b.length;
        int[][] c = new int[len1 + 1][len2 + 1];
        int max = 0;
        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                if (i == 0 || j == 0) {
                    c[i][j] = 0;
                } else if (a[i - 1] == b[j - 1]) {
                    c[i][j] = c[i - 1][j - 1] + 1;
                } else {
                    c[i][j] = 0;
                }
                max = Math.max(max,c[i][j]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        RepeatedSubarray rs = new RepeatedSubarray();
        int[] a = {0, 1, 1, 1, 1};
        int[] b = {1, 0, 1, 0, 1};
        int max = rs.findLength(a, b);
        System.out.println(max);
    }
}
