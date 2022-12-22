package Strings;

import java.util.ArrayList;

public class PangramCheck {
    public static void main(String[] args) {
        ArrayList<String> strArr = new ArrayList<>();
        strArr.add("the");
        strArr.add("quick");
        strArr.add("brown");
        strArr.add("fox");
        strArr.add("jumps");
        strArr.add("over");
        strArr.add("the");
        strArr.add("lazy");
        strArr.add("dog");
        System.out.println(isPangram(strArr));
    }

    static boolean isPangram(ArrayList<String> strArray) {
        char[] arr = new char[26];
        for(int i = 0; i < strArray.size(); i++) {
            String str = strArray.get(i);
            for(int j = 0; j < str.length(); j++) {
                int code = str.charAt(j) - 'a';
                arr[code]++;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
