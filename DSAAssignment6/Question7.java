package DSAAssignment6;

import java.util.Arrays;

public class Question7 {
    public static int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        //right -> bottom -> left -> top
        int top = 0, left = 0;
        int bottom = n-1, right = n-1;
        int k = 1;
        while(top<=bottom && left<=right){
            //right
            for(int i=left;i<=right;i++){
                ans[top][i] = k++ ;
            }
            top++;
            //bottom
            for(int i=top;i<=bottom;i++){
                ans[i][right] = k++;
            }
            right--;
            if(top<=bottom){
                //left
                for(int i=right;i>=left;i--){
                    ans[bottom][i] = k++;
                  }
                 bottom--;
            }
            if(left<=right){
                //top
                for(int i=bottom;i>=top;i--){
                    ans[i][left] = k++;
                }  
                left++;
            }
            
        }
        
        return ans;
    
    }
    public static void main(String[] args) {
        int n = 3;
        int[][] result = generateMatrix(n);
        System.out.print("[");
        for (int[] row : result) {
        	
            System.out.print(Arrays.toString(row));
        }
        System.out.print("]");
    }
}
