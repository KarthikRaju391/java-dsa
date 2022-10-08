package Accenture;

import java.util.Arrays;

public class ReplaceString {
    public static void main(String[] args) {
        System.out.println(replaceChar("apples", 'a', 'p'));
    }

    static String replaceChar(String str, char a, char p) {
        char[] arr = str.toCharArray();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == a) {
               res.append(p);
            } else if(arr[i] == p) {
                res.append(a);
            }else {
                res.append(arr[i]);
            }
        }

        return res.toString();
    }
}
