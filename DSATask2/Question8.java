package DSATask2;

public class Question8 {
    public static int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (min > n) {
                min = n;
            }
            if (max < n) {
                max = n;
            }
        }
        int diff = max - min;
        if (diff <= k + k) {
            return 0;
        } else {
            return diff - (k + k);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        System.out.println(smallestRangeI(nums, k));
    }
}
