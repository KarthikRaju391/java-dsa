package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int ans = recSum(42);
        System.out.println(ans);
    }

    static int recSum(int n) {
        if(n < 10) {
            return n;
        }
        return n % 10 * recSum(n/10);
    }
}
