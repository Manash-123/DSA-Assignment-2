package DSAAssignment6;

import java.util.Arrays;

public class Question1 {
    public static int[] diStringMatch(String s) {
        int n = s.length();
        int[] perm = new int[n + 1];

        int start = 0;
        int end = n;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                perm[i] = start++;
            } else {
                perm[i] = end--;
            }
        }
        perm[n] = start;

        return perm;
    }
    public static void main(String[] args) {
        String s = "IDID";
        int[] result = diStringMatch(s);
        System.out.println(Arrays.toString(result));
    }
}
