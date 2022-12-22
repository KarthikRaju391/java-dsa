package arrays.advanced;

// In this problem, we are given two strings and we have to
// return the number of eliminations of characters from both the
// strings such that they will end up being an anagram

public class PossibleAnagrams {
    public static void main(String[] args) {
        System.out.println(getAnagram("hello", "billion"));
    }

    static int getAnagram(String s1, String s2) {
        int[] charCount1 = getCharCounts(s1);
        int[] charCount2 = getCharCounts(s2);
        return getDelta(charCount1, charCount2);
    }

    private static int getDelta(int[] count1, int[] count2) {
        if(count1.length != count2.length) {
            return -1;
        }

        int delta = 0;
        for(int i = 0; i < count1.length; i++) {
            int difference = Math.abs(count1[i] - count2[i]);
            delta += difference;
        }
        return delta;
    }

    static int[] getCharCounts(String s) {
        int[] charCount = new int[26];

        for(int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            int offset = 'a';
            int code = c - offset;
            charCount[code]++;
        }

        return charCount;
    }
}
