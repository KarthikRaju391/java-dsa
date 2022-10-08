package Recursion.StringsAndSubsequence;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
        List<String> path = new ArrayList<>();
        List<List<String>> res = new ArrayList<>();
        partitionFn("aabb", 0, path, res);
        System.out.println(res);
    }

    static void partitionFn(String s, int index, List<String> path, List<List<String>> res) {
        if(index == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i = index; i < s.length(); i++) {
            if(isPalindrome(s, index, i)) {
                path.add(s.substring(index, i+1));
                partitionFn(s, index + 1, path, res);
                path.remove(path.size() - 1);
            }
        }
    }

    static boolean isPalindrome(String s, int start ,int end) {
        while(start <= end) {
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
}
