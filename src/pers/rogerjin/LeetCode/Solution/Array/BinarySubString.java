package pers.rogerjin.LeetCode.Solution.Array;

public class BinarySubString {
    //Give a string s, count the number of non-empty (contiguous) substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.

    //Substrings that occur multiple times are counted the number of times they occur.

    //        Example 1:

    //Input: "00110011"
    //Output: 6
    //Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".

    //Notice that some of these substrings repeat and are counted the number of times they occur.

    //Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.

    //Example 2:

    //Input: "10101"
    //Output: 4
    //Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.


    public int countBinarySubstrings(String s) {
        int len1 = 1;
        int len2 = 1;
        int cnt = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                ++len2;
            } else {
                len1 = len2;
                len2 = 1;
            }
            if (len1 >= len2) {
                ++cnt;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        BinarySubString bs = new BinarySubString();
        String s = "11001100";
        int ret = bs.countBinarySubstrings(s);
        System.out.println(ret);
    }
}
