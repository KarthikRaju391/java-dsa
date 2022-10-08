package Cognizant;

import java.util.Scanner;

public class RotatedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int n = sc.nextInt();
        String rotate = leftRotate(s1, n);

        char[] ch1 = s1.toCharArray();
        char[] ch2 = rotate.toCharArray();

        int count = 0;
        for(int i = 0; i < s1.length(); i++) {
            if(ch1[i] == ch2[i]) {
               count++;
            }
        }

        System.out.println(count);
    }

    static String leftRotate(String d, int n) {
        return d.substring(n) + d.substring(0, n);
    }
}
