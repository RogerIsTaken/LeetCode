package pers.rogerjin.sort;

public class Bubble {
    public void sort(int[] nums) {
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] < nums[j - 1]) {
                    tmp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = tmp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }


    public static void main(String[] args) {
        Bubble b = new Bubble();
        int[] nums = {1, 4, 5, 3, 7, 2, 11, 9, 10};
        b.sort(nums);
    }
}
