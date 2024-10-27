package binary_search;

public class test_69 {
    public static void main(String[] args) {
        int i = mySqrt(8);
        System.out.println(i);
    }

    public static int mySqrt(int x) {
        long left = 0;
        long right = x / 2 + 1;
        long mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (mid * mid < x) {
                left = mid + 1;
            } else if (mid * mid > x) {
                right = mid - 1;
            } else {
                return (int) mid;
            }
        }
        return (int) right;
    }
}