package Array.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class test_34 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        System.out.println("请输入：");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int[] num = searchRange(arr, target);

        System.out.println(Arrays.toString(num));

    }

    public static int[] searchRange(int[] nums, int target) {
        int left = searchLeft(nums, target);
        int right = searchRight(nums, target);

        return new int[]{left, right};
    }

    //寻找左边界
    public static int searchLeft(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                right = mid - 1;
            }
        }

        if (left >= nums.length || nums[left] != target) return -1;

        return left;
    }

    //寻找右边界
    public static int searchRight(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (right < 0 || nums[right] != target) return -1;

        return right;
    }
}