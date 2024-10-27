package binary_search;

import java.util.Scanner;

/**
 * 二分查找
 */
public class test_704 {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        System.out.println("请输入：");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int num = search1(arr, target);

        System.out.println(num);
    }


    //左闭右闭
    public static int search1(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            }else{
                if(arr[mid] < target){
                    left = mid + 1;
                }else if(arr[mid] > target){
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    //左闭右开
    public static int search2(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        int mid;

        while (left < right) {
            mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            }else{
                if(arr[mid] < target){
                    left = mid + 1;
                }else if(arr[mid] > target){
                    right = mid;
                }
            }
        }
        return -1;
    }
}
