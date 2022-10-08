package Capgemini;

public class NumAsSumOfTwoPrimes {
    public static void main(String[] args) {
        System.out.println(findTwoPrimes(28));
    }

    static String findTwoPrimes(int n) {
        for(int i = 2; i <= n/2; i++) {
            if(checkPrime(i)) {
                if(checkPrime(n - i)) {
                    return i + " + " + (n - i);
                }
            }
        }
        return "Not possible";
    }

    static boolean checkPrime(int n) {
        int c = 2;
        while(c * c <= n) {
            if(n % c == 0) {
                return false;
            }else {
                c++;
            }
        }
        return true;
    }
}
