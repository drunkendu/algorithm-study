package Array.binary_search;

public class test_367 {
    public static void main(String[] args) {

    }

    public boolean isPerfectSquare(int num) {
        long left = 0;
        long right = num / 2 + 1;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid < num) {
                left = mid + 1;
            } else if (mid * mid > num) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
