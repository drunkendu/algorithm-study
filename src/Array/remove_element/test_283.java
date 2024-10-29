package Array.remove_element;

import java.util.Arrays;

public class test_283 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes2(arr);
        System.out.println(Arrays.toString(arr));
    }

    /***
     * 快慢指针
     * @param nums
     */
    public static void moveZeroes1(int[] nums) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != 0) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        while (slowIndex < nums.length) {
            nums[slowIndex] = 0;
            slowIndex++;
        }
    }

    /**
     * 当遇到0时，记录它的偏移量
     *
     * @param nums
     */
    public static void moveZeroes2(int[] nums) {
        int offset = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                //如果是0，偏移量+1
                offset++;
            } else if (offset != 0) {
                nums[i - offset] = nums[i];
                nums[i] = 0;
            }
        }
    }
}
