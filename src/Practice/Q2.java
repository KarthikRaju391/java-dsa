package Practice;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] primes = generatePrimeNums(6);
        int[] fibo = generateFibonacci(6);
        int[] res = new int[primes.length + fibo.length];
        int k = 0;
        int l = 0;
        for(int i = 0; i < res.length; i++) {
            if(i % 2 == 0) {
                res[i] = primes[k++];
            } else {
                res[i] = fibo[l++];
            }
        }
        System.out.println(Arrays.toString(res));
    }

    static int[] generatePrimeNums(int n) {
        int[] primes = new int[n];
        int count = 0;
        int num = 1;
        while(count < n) {
            if(isPrime(num)) {
                primes[count++] = num++;
            } else {
                num++;
            }
        }

        return primes;
    }

    static int[] generateFibonacci(int n) {
        int[] fibo = new int[n];
        int prev2 = 0;
        int prev = 1;
        fibo[0] = prev2;
        fibo[1] = prev;
        for(int i = 2; i < n; i++) {
            int curr = prev2 + prev;
            fibo[i] = curr;
            prev2 = prev;
            prev = curr;
        }
        return fibo;
    }
    static boolean isPrime(int n) {
        int c = 2;
        if(n == 1) {
            return false;
        }
        while(c * c <= n) {
            if(n % c == 0) {
                return false;
            } else {
                c++;
            }
        }
        return true;
    }

}
