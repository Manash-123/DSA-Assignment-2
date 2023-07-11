package DSAAssignment6;

import java.util.Arrays;

public class Question5 {
    public static int minProductSum(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int sum = 0;
        int length = nums1.length;
        for (int i = 0; i < length; i++)
            sum += nums1[i] * nums2[length - 1 - i];
        return sum;
    }
    public static void main(String[] args) {
        int[] nums1 = {5,3,4,2};
        int[] nums2 = {4,2,2,5};
        System.out.println(minProductSum(nums1, nums2));
    }
}
