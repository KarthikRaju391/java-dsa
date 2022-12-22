package Capgemini;

import java.util.HashMap;
import java.util.Map;

public class ReduceStrings {
    public static void main(String[] args) {
        System.out.println(reduce("aabbbbeeeeffggg"));
    }

    static String reduce(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(entry.getValue());
        }
        return sb.toString();
    }
}
