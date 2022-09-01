package Recursion.StringsAndSubsequence;

import java.util.Objects;

public class SkipCharInString {
    public static void main(String[] args) {
        String name = "fdapplet";
        String res = skipSubstr(name);
        System.out.println(res);
    }

    static String skipped(String str, String skip) {
        if(str.isEmpty()) {
            return skip;
        }

        if(str.charAt(0) == 'a') {
            return skipped(str.substring(1), skip);
        } else {
            return skipped(str.substring(1), skip + str.charAt(0));
        }
    }

    static String skipped2(String str) {
        String skip = "";
        if(str.isEmpty()) {
            return skip;
        }

        if(str.charAt(0) == 'a') {
            skip = "" + skipped2(str.substring(1));
        } else {
            skip = str.charAt(0) + skipped2(str.substring(1));
        }
        return skip;
    }

    static String skipSubstr(String str) {
        if(str.isEmpty()) {
            return "";
        }

        if(str.startsWith("apple")) {
            return skipSubstr(str.substring(5));
        } else {
            return str.charAt(0) + skipSubstr(str.substring(1));
        }
    }
}
