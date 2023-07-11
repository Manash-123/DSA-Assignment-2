package DSAAssignment8;

import java.util.*;

public class Question6 {
    public static List<Integer> findAnagrams(String s1, String s2) {
        int s = s1.length(), p = s2.length();
        if(s < p)
            return new ArrayList<>();
        
        List<Integer> li = new ArrayList<>();
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        
        for(int i=0; i<p; i++) {
            c2[s2.charAt(i) - 'a']++;
            c1[s1.charAt(i) - 'a']++;
        }
        if(areEqual(c1, c2))
            li.add(0);
        
        for(int i=p; i<s; i++) {
            c1[s1.charAt(i-p) - 'a']--;
            c1[s1.charAt(i) - 'a']++;
            if(areEqual(c1, c2))
                li.add(i-p+1);
        }
        
        return li;
    }
    
    private static boolean areEqual(int[] a, int[] b) {
        for(int i=0; i<26; i++)
            if(a[i] != b[i])
                return false;
        return true;
    }
    public static void main(String[] args) {
        String s1 = "cbaebabacd"; 
        String s2 = "abc"; 
        System.out.println(findAnagrams(s1, s2));
    }
}
