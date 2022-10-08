package Recursion.StringsAndSubsequence;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(remove("", "aabccba"));
    }

    static String remove(String p, String up) {
        if(up.isEmpty()) {
            return p;
        }

        char ch = up.charAt(0);

        if(p.length() > 0 && p.charAt(p.length() - 1) == ch) {
           return remove(p, up.substring(1));
        }

        return remove(p+ch, up.substring(1));
    }
}
