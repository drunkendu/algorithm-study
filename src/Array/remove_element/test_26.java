package Array.remove_element;

public class test_26 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = removeDuplicates2(arr);
        System.out.println(i);
    }

    /**
     * 快慢指针
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates1(int[] nums) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[slowIndex] != nums[fastIndex]) {
                ++slowIndex;
                nums[slowIndex] = nums[fastIndex];
            }
        }
        return slowIndex + 1;
    }

    /**
     * 相向指针
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates2(int[] nums) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex <= rightIndex) {
            if (nums[leftIndex] != nums[rightIndex]) {
                leftIndex++;
                nums[leftIndex] = nums[rightIndex];
            } else {
                rightIndex--;
            }
        }
        return leftIndex + 1;
    }
}
