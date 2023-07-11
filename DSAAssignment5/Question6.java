package DSAAssignment5;

import java.util.*;

public class Question6 {
    public static List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        for (int i = 0; i < n; i++) {
            nums[nums[i] % n]
                = nums[nums[i] %n]
                  + n;
        }
     ArrayList<Integer> ans=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] > n * 2) {
                if(i==0){
                    ans.add(n);
                    continue;
                }
                ans.add(i);
            }
        }
        return ans;
    }  
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
}
