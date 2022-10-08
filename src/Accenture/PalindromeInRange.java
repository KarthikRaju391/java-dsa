package Accenture;

import java.util.Scanner;

public class PalindromeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ll = sc.nextInt();
        int ul = sc.nextInt();

        for(int i = ll; i < ul; i++) {
            if(i == isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static int isPalindrome(int n) {
       int rev = 0;
       int div = n;
       while(div != 0) {
           int r = div % 10;
           rev = rev * 10 + r;
           div = div / 10;
       }
       return rev;
    }
}
