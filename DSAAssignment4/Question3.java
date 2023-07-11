package DSAAssignment4;

import java.util.Arrays;

public class Question3 {
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for(int i = 0; i < cols; i++){
            for(int j = 0; j < rows; j++){
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] result = transpose(matrix);
        System.out.print("[");
        for (int[] row : result) {
        	
            System.out.print(Arrays.toString(row));
        }
        System.out.print("]");
    }
}
