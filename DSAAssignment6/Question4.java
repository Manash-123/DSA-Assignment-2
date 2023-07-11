package DSAAssignment6;

import java.util.*;

public class Question4 {
    public static int findMaxLength(int[] nums) {
        int n=nums.length;
        int sum=0;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);

        for (int i=0;i<n;i++){
            if (nums[i]==0){
                sum+=-1;
            }else if (nums[i]==1){
                sum+=1;
            }
            if (map.containsKey(sum)){
                int id=map.get(sum);
                int len=i-id;
                if (len>ans){
                    ans=len;
                }
            }else {
                map.put(sum,i);
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println(findMaxLength(nums));
    }
}
