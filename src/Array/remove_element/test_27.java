package Array.remove_element;

public class test_27 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        int val = 3;
        int i = removeElement1(arr, val);
        System.out.println(i);
    }

    /**
     * 暴力解法
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement1(int[] nums, int val) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == val) {
                for (int j = i + 1; j < length; j++) {
                    nums[j - 1] = nums[j];
                }
                i--;
                length--;
            }
        }
        return length;
    }

    /**
     * 快慢指针
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement2(int[] nums, int val) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }

    /**
     * 相向指针
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement3(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] == val) {
                nums[left] = nums[right];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }
}
