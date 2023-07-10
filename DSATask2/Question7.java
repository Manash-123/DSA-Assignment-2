package DSATask2;

public class Question7 {
    public static boolean isMonotonic(int[] nums) {
        int count=0;
        int count1=0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]<=nums[i+1]){
                count++;
            }
        }
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>=nums[i+1]) {
                count1++;
            }
        }
        return count==nums.length-1 || count1==nums.length-1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        System.out.println(isMonotonic(nums));
    }
}
