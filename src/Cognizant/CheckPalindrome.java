package Cognizant;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(reversed(123));
    }

    static int reversed(int n) {
        int reverse = 0;
        while(n != 0) {
            int rev = n % 10;
            reverse = reverse * 10 + rev;
            n /= 10;
        }
        return reverse;
    }
}
