package Cognizant;

public class PermutationAndCombination {
    public static void main(String[] args) {
        int ans = findPermuation(5, 2);
        long m = 1000000009;
        System.out.println(ans%m);
    }

    static int fact(int n) {
        int res = 1;
        for(int i = n; i >=1; i--) {
           res *= i;
        }
        return res;
    }

    static int findPermuation(int n, int r) {
        int numerator = fact(n);
        int denom1 = fact(r);
        int denom2 = fact(n-r);

        return numerator/(denom1 * denom2);
    }
}
