package Cognizant;

public class LongestPalindromicSubseq {
    public static void main(String[] args) {
        System.out.println(longestPalindromeSequence("abcdefe"));
    }

    static String longestPalindromeSequence(String s) {
        int length = s.length();
        String res = "";
        int resLength = 0;

        for(int i = 0; i < length; i++) {
            int l = i;
            int r = i;
            while(l >= 0 && r < length && s.charAt(l) == s.charAt(r)) {
                if((r - l + 1) > resLength) {
                    res = s.substring(l, r+1);
                    resLength = r - l + 1;
                }
                l--;
                r++;
            }
            l = i;
            r = i + 1;
            while(l >= 0 && r < length && s.charAt(l) == s.charAt(r)) {
                if((r - l + 1) > resLength) {
                    res = s.substring(l, r+1);
                    resLength = r - l + 1;
                }
                l--;
                r++;
            }
        }
        return res;
    }
}
