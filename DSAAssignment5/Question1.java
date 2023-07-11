package DSAAssignment5;

import java.util.Arrays;

public class Question1 {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        }

        int[][] res = new int[m][n];
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = original[index];
                index++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int m = 2;
        int n = 2;

        int[][] result = construct2DArray(original, m, n);

        // for (int i = 0; i < m; i++) {
        //     System.out.print(Arrays.toString(result[i]));
        // }
        
        // Print the 2D array
        System.out.print("[");
        for (int[] row : result) {
        	
            System.out.print(Arrays.toString(row));
        }
        System.out.print("]");
    }
}