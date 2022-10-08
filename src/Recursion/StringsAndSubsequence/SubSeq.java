package Recursion.StringsAndSubsequence;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        subSeq("", "abc");
    }

    static void subSeq(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));
    }


    static ArrayList<String> subSeqList(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left =   subSeqList(p + ch, up.substring(1));
        ArrayList<String> right = subSeqList(p, up.substring(1));

        left.addAll(right);

        return left;
    }

    static void subSeqAscii(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSeqAscii(p + ch, up.substring(1));
        subSeqAscii(p, up.substring(1));
        subSeqAscii(p + (ch + 0), up.substring(1));
    }
    static ArrayList<String> subSeqNew(String p, String up, ArrayList<String> list) {
       if(up.isEmpty()) {
           list.add(p);
           return list;
       }

       char ch = up.charAt(0);
        System.out.println(ch-'0');

       subSeqNew(p + ch, up.substring(1), list);
       subSeqNew(p, up.substring(1), list);

       return list;
    }
}