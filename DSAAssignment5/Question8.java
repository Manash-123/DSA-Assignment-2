package DSAAssignment5;

import java.util.Arrays;

public class Question8 {
    public static int[] findOriginalArray(int[] changed) {
        if(changed.length %2 !=0)
            return new int[0];
        int max = Integer.MIN_VALUE;
        for(int num:changed)
            max = Math.max(max,num);
        if(max%2 !=0)return new int[0];
        
        int counts[] = new int[max+1];
        for(int num:changed)
            counts[num]++;
        
        int original[] = new int[changed.length/2];
        if(counts[0]%2 !=0) return new int[0];
        int idx = counts[0]/2;
        
        for(int i=1;i<counts.length;i++){
            if(counts[i] ==0)continue;
            if(2*i > max || counts[i]>counts[i+i])
                return new int[0];
            
            int count = counts[i];
            counts[i+i] -= count;
            while(count-->0)
                original[idx++]=i;
        }
        return original;
    }
    public static void main(String[] args) {
        int[] changed = {1,3,4,2,6,8};
        int[] result = findOriginalArray(changed);
        System.out.println(Arrays.toString(result));
    }
}
