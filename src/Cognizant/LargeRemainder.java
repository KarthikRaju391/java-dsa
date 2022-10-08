package Cognizant;

public class LargeRemainder {
    public static void main(String[] args) {
        System.out.println(remainder("13589234356546756"));
    }

    static int remainder(String str) {
        int len = str.length();
        int num, rem = 0;

        for(int i = 0; i < len; i++) {
            num = rem * 10 + (str.charAt(i) - '0');
            rem = num % 11;
        }
        return rem;
    }
}
