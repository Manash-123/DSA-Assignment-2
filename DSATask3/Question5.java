package DSATask3;

import java.util.Arrays;

public class Question5 {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int key =0;
        for(int i = n-1; i>=0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
                key = 1;
                continue;
            }
            digits[i]++;
            break;
        }
        if(digits[0]==0){
            digits = new int[n+1];
            Arrays.fill(digits,0);
            digits[0] = 1;
        }
        return digits;
        
    }
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        System.out.println(plusOne(digits));
    }
}
