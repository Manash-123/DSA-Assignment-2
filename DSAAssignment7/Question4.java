package DSAAssignment7;

public class Question4 {
    public static String reverseWords(String s) {
    
        if (s == null || s.length() <= 1) {
            return s;
        }
        char[] str = s.toCharArray();
        int start = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ') {
                reverse(str, start, i - 1);
                start = i + 1;
            } else if (i == str.length - 1) {
                reverse(str, start, i);
            }
        }
        
        return String.valueOf(str);
    }

    public static void reverse(char[] s, int start, int end) {
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
