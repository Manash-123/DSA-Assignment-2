package DSAAssignment4;

public class Question7 {
    public static int maxCount(int m, int n, int[][] ops) {
        if(ops.length == 0){
            return m * n;
        }
        int row = Integer.MAX_VALUE;
        int col = Integer.MAX_VALUE;

        for(int i = 0; i < ops.length; i++){
            if(ops[i][0] < row){
                row = ops[i][0];
            }
            if(ops[i][1] < col){
                col = ops[i][1];
            }
        }
        return row * col;
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] ops = {{2,2},{3,3}};
        System.out.println(maxCount(m, n, ops));
    }
}
