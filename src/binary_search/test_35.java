package binary_search;

import java.util.Scanner;

public class test_35 {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        System.out.println("请输入：");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int num = searchInsert(arr, target);

        System.out.println(num);
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        //如果数组中没有这个元素
        return right + 1;
    }
}
