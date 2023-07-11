package DSAAssignment7;

public class Question5 {
    public static String reverseStr(String s, int k) {
        char arr[] = s.toCharArray();

        for(int i=0; i<s.length(); i=i+(2*k)){
            int start = i;
            int end = Math.min(i+k, s.length()) -1;
            char temp;

            while(start < end){
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s, k));
    }
}
