package DSAAssignment6;

import java.util.Arrays;

public class Question8 {
    public static int[][] multiply(int[][] A, int[][] B) {

        //validity check
        int[][] C = new int[A.length][B[0].length];

        for (int i = 0; i < C.length; i++) {
            for (int k = 0; k < A[0].length; k++) {
                if (A[i][k] != 0) { 
                    for (int j = 0; j < C[0].length; j++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
        }

        return C;
    }
    public static void main(String[] args) {
        int[][] A = {{1,0,0},{-1,0,3}};
        int[][] B = {{7,0,0},{0,0,0},{0,0,1}};
        int[][] result = multiply(A,B);
        System.out.print("[");
        for (int[] row : result) {
        	
            System.out.print(Arrays.toString(row));
        }
        System.out.print("]");

    }
}
