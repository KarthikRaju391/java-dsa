package Cognizant;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isPrime(4));
//        int start = in.nextInt();
//        System.out.println("Enter the end: ");
//        int end = in.nextInt();
//        for(int i = start; i <= end; i++) {
//            if(isPrime(i)) {
//                System.out.println(i);
//            }
//        }
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
