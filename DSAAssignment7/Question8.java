package DSAAssignment7;

public class Question8 {
    public static boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length <= 2) {
            return true;
        }

        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];

            if ((y2 - y1) * (x - x1) != (y - y1) * (x2 - x1)) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int[][] coordinates =  {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        System.out.println(checkStraightLine(coordinates));
    }
}
