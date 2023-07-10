package DSATask3;

public class Question4 {
    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == target)
                return i; 
            if (i == 0 && target < nums[i]) 
                return i; 
            if (i > 0 && target > nums[i-1] && target < nums[i])
                return i; 
            i++;
        }
        return i;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }
}
