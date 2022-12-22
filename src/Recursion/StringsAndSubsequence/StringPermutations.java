package Recursion.StringsAndSubsequence;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    public static void main(String[] args) {
        List<String> res = new ArrayList<>();
        findAllPermutations("", "abc", res);
        System.out.println(res);
        System.out.println(getCount("", "abc"));
    }

    static void findAllPermutations(String p, String up, List<String> ans) {
        if(up.isEmpty()) {
            ans.add(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            // p.length() can be ignored as the default behaviour of the substring method
            // does the same thing if we just mention i
            findAllPermutations(f + ch + s, up.substring(1), ans);
        }
    }

    static int getCount(String p, String up) {
        if(up.isEmpty()) {
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;
        for(int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count += getCount(f + ch + s, up.substring(1));
        }
        return count;
    }
}
