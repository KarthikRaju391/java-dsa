package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 14541;
        int ans = recursiveReverse(n);

        // Check for palindrome
        if(ans == n) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }

    static int recursiveReverse(int n) {
        if(n < 10) {
            return n;
        }
        // getting the number of digits
        int p = (int)(Math.log10(n/10)) + 1;
        // multiplying the digit with required power of 10
        return (n%10) * (int)(Math.pow(10, p)) + recursiveReverse(n / 10);
    }
}
