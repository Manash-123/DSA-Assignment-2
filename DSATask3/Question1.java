package DSATask3;

import java.util.Arrays;

public class Question1 {
    public static int threeSumClosest(int[] nums, int target) {
        int closest = Integer.MAX_VALUE, closestSum = Integer.MAX_VALUE,i=-1,j=-1,k=-1;
        Arrays.sort(nums);                               // nlog(n)
        for(i=0;i<nums.length-2;i++){                    // O(n)
            j = i+1;
            k = nums.length-1;
            while(j < k){                                // O(n)
                int sum = nums[i] + nums[j] + nums[k];
                if(sum==target){return target;}
                else if(sum<target) {j++;}
                else {k--;}
                // Updating closestSum according to closest
                int close = Math.abs(sum - target);
                if(close<closest){
                    closest = close;
                    closestSum = sum;
                }               
            }
        }
        return closestSum;
    }
    public static void main(String[] args) {
            int[] nums = {-1,2,1,-4};
            int target = 1;
            System.out.println(threeSumClosest(nums, target));
        }
    }

